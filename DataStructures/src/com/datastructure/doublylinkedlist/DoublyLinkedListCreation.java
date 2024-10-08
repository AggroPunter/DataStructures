package com.datastructure.doublylinkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedListCreation {
	
	private ListNode head;
	private ListNode tail;
	private int length = 0;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
		
	}
	
	public DoublyLinkedListCreation() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}
	
	public int findLength() {
		return length;
	}
	
	public void insertToLast(int data) {
		ListNode newNode = new ListNode(data);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
	
	private static void traverseListInReverse(ListNode tail) {
		if(tail == null) return;
		ListNode temp = tail;
		while(temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	
	private static void traverseListInForward(ListNode head) {
		if(head == null) return;
		
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void insertAtBeginning(int data) {
		ListNode newNode = new ListNode(data);
		if(isEmpty()) {
			tail = newNode;
		}else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

	private void deleteFirstNode() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if(head == tail) tail = null;
		else head.next.previous = null;
		head = head.next;
		temp.next = null;
		length--;
	}
	
	private void deleteLastNode() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = tail;
		if(head == tail) head = null;
		else {
			tail = tail.previous;
			tail.next = null;
			temp.previous = null;
		}
		length--;
	}

	
	public static void main(String[] args) {
		DoublyLinkedListCreation dl = new DoublyLinkedListCreation();
		dl.insertToLast(1);
		dl.insertToLast(10);
		dl.insertToLast(15);
		dl.insertToLast(25);
		
		System.out.println("Printing List in forward direction");
		traverseListInForward(dl.head);
		System.out.println();
		
		System.out.println("Printing list in reverse direction");
		traverseListInReverse(dl.tail);
		System.out.println();
		
		System.out.println("Inserting 0 in the beginning");
		dl.insertAtBeginning(0);
		traverseListInForward(dl.head);
		System.out.println();
		
		System.out.println("Deleting firstNode from LinkedList");
		dl.deleteFirstNode();
		traverseListInForward(dl.head);
		System.out.println();
		
		System.out.println("Deleting last node from linkedList");
		dl.deleteLastNode();
		traverseListInForward(dl.head);
	}


}
