package com.datastructure.stack;

public class StackUsingArray {

	private int top;
	private int[] arr;
	
	public StackUsingArray(int capacity) {
		top = -1;
		arr = new int[capacity];
	}
	
	public StackUsingArray() {
		this(10);
		top = -1;
	}
	
	public void push(int data) {
		if(isFull()) throw new RuntimeException("Stack is full");
		top ++;
		arr[top] = data;
	}
	
	public void print() {
		for(int element : arr) {
			System.out.println(element);
		}
	}
	
	public boolean isFull() {
		return arr.length == size();
	}
	
	private int size() {
		return top+1;
	}
	
	private int peek() {
		if(isEmpty()) throw new RuntimeException("Stack is Empty");
		return arr[top];
		
	}

	private int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		
		int result = arr[top];
		top--;
		return result;
	}

	private boolean isEmpty() {
		return top < 0;
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.print();
		
		stack.pop();
		stack.print();
		
		System.out.println("Returning Peek element "+stack.peek());
		
	}


}
