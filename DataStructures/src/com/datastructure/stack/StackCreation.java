package com.datastructure.stack;

import java.util.EmptyStackException;

public class StackCreation {
	
	private ListNode top;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
		
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public StackCreation() {
		top = null;
		length = 0;
	}
	
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) throw new EmptyStackException();
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) throw new EmptyStackException();
		return top.data;
	}
	
	private void displayStack() {
		ListNode temp = top;
		while(temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		StackCreation stack = new StackCreation();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.displayStack();
		System.out.println(stack.peek());
		stack.pop();
		stack.displayStack();
	}



}
