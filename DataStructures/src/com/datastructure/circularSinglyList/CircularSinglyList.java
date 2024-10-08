package com.datastructure.circularSinglyList;

import java.util.NoSuchElementException;

public class CircularSinglyList {
	
	private ListNode last;
	private int length;
	
	private class ListNode{
		
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
		}
		
	}
	
	public CircularSinglyList() {
		this.last = null;
		this.length = 0;
	}

	public int findLength() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	private void createCircularList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(15);
		ListNode fourth = new ListNode(20);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
		length = 4;
	}
	
	private void display() {
		if(last == null) return;
		ListNode first = last.next;
		
		while(first != last) {
			System.out.print(first.data + "-> ");
			first = first.next;
		}
		System.out.print(first.data);
		System.out.println();
	}
	
	private void insertNodeAtBegin(int data) {
		ListNode newNode = new ListNode(data);
		if(last == null) last = newNode;
		else newNode.next = last.next;
		last.next = newNode;
		length++;
	}
	
	private void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if(last == null) {
			last = newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		length++;
	}
	
	private void deleteFirstNode() {
		if(isEmpty()) throw new NoSuchElementException();
		ListNode remove = last.next;
		if(last.next == last) last = null;
		else last.next = remove.next;
		remove.next = null;
		length--;
		
	}

	public static void main(String[] args) {
		CircularSinglyList cl = new CircularSinglyList();
		cl.createCircularList();
		cl.display();
		System.out.println();
		System.out.println("Inserting 0 and -5 in the beginning of the Circular Linked List");
		cl.insertNodeAtBegin(0);
		cl.insertNodeAtBegin(-5);
		cl.display();
		System.out.println();
		System.out.println("Inserting 25 at end");
		cl.insertLast(25);
		cl.display();
		System.out.println();
		System.out.println("Deleting 1st node from linkedList");
		cl.deleteFirstNode();
		cl.deleteFirstNode();
		cl.display();
		
	}

}
