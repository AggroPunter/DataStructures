package com.datastructure.linkedlist;

public class ListNode {

	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}		
	
	
	public static void display(ListNode head) {
		ListNode current = head;
		int count = 0;
		while(current != null) {
			System.out.print(current.data+",");
			count++;
			current = current.next;
		}
		System.out.println();
		System.out.println("Length of the linked list is "+count);
	}
	
}
