package com.datastructure.Queue;

import java.util.NoSuchElementException;

public class QueueCreation {
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	
	public QueueCreation() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}

	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	private boolean isEmpty() {
		return length == 0;
	}
	
	private int length() {
		return length;
	}
	
	private void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front = temp;
		}
		else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	private void print() {
		if(isEmpty()) {
			return;
		}
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data + "-> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	private int dequeue() {
		if(isEmpty()) throw new NoSuchElementException();
		int result = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		length--;
		return result;
	}
	
	private int last() {
		if(isEmpty()) throw new NoSuchElementException("Empty");
		return rear.data;
		
	}

	private int first() {
		if(isEmpty()) throw new NoSuchElementException("Empty");
		return front.data;
	}
	
	public static void main(String[] args) {
		QueueCreation queue = new QueueCreation();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println("Printing elements in Queue");
		queue.print();
		queue.dequeue();
		System.out.println("Printing elements after removing first element");
		queue.print();
		System.out.println(queue.first());
		System.out.println(queue.last());
		
	}

}
