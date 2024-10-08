package com.datastructure.linkedlist;

public class LinkdedListCreation {
	
	private ListNode head;
	
	public static class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}		
	}
	
	public void display() {
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
	
	public void insertNodeToFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertNodeToLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void insertAtPosition(int data, int position) {
		ListNode newData = new ListNode(data);
		if(position == 1) {
			newData.next = head;
			head = newData;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count ++;
			}
			ListNode insertAfter = previous.next;
			newData.next = insertAfter;
			previous.next = newData;
		}
	}
	
	public ListNode deleteLastNode() {
		if(head == null || head.next == null) {
			return head;
		}
		else {
			ListNode current = head;
			ListNode previous = null;
			while(current.next != null) {
				previous = current;
				current = current.next;
			}
			previous.next = null;
			return current;
		}
	}
	
	public ListNode deleteFirstNode() {
		if(head == null) {
			return null;
		}
		ListNode removeNode = head;
		head = head.next;
		removeNode.next = null;
		return removeNode;
	}
	
	public void deleteNodeAt(int position) {
		if(position == 1) {
			head = head.next;
		}
		
		ListNode previous = head;
		int count = 1;
		while(count < position - 1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = current.next;
	}
	
	public boolean searchElement(int toSearch) {
		ListNode current = head;
		while(current != null) {
			if(current.data == toSearch) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
    public ListNode reverse() {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;  
            current.next = previous; 
            previous = current;  
            current = next;  
        }

        return previous; 
    }
    
	public ListNode findNthNode(int n) {
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while(count < n) {
			refPtr = refPtr.next;
			count++;
		}
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
		
	}
	

	private void removeDuplicatesSorted() {
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data){
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
		
	}

	
	private void insertSorted(ListNode newNode) {
		ListNode current = head;
		ListNode temp = null;
		while(current != null & current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
	}

	private void removeNode(int n) {
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data != n) {
			temp = current;
			current = current.next;
		}
		if(current == null) return;
		temp.next = current.next;		
	}
	
	private boolean checkForLoop(boolean remove) {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(fastPtr == slowPtr) {
				ListNode value = getFirstNodeOfLoop(slowPtr);
				System.out.println("Starting point of the loop is "+value.data);
				if(remove) {
					removeLoop(slowPtr);
				}
				return true;
			}
		}
		
		return false;
	}
	
	private void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		while(slowPtr.next != temp.next) {
			slowPtr = slowPtr.next;
			temp = temp.next;
		}
		slowPtr.next = null;
		System.out.println("Data in the last node after loop removal "+ slowPtr.data);
	}

	private ListNode getFirstNodeOfLoop(ListNode slowPtr) {
		// Floyd's cycle detection algorithm
		ListNode current = head;
		while(current != slowPtr) {
			current = current.next;
			slowPtr = slowPtr.next;
		}
		return current;
		
	}

	private void createALoopInList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
		
	}
	
	
	public static void main(String[] args) {
		LinkdedListCreation ex = new LinkdedListCreation();
		ex.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode four = new ListNode(4);
		
		ex.head.next = second;
		second.next = third;
		third.next = four;
		
		ex.display();
		ex.insertNodeToFirst(0);
		System.out.println("After adding node to first");
		ex.display();
		
		ex.insertNodeToLast(5);
		System.out.println("After adding node to last");
		ex.display();
		
		System.out.println("Inserting 7 in the last");
		ex.insertNodeToLast(7);
		ex.display();
		
		ex.insertAtPosition(6, 6);
		System.out.println("After adding 6 at 6th position");
		ex.display();
		
		System.out.println("Deleting first node of linkedlist");
		ex.deleteFirstNode();
		ex.display();
		
		System.out.println("Deleting Last node from LinkedList");
		ex.deleteLastNode();
		ex.display();
		
		System.out.println("Deleting node at a specified position  - 6");
		ex.deleteNodeAt(6);
		ex.display();
		
		System.out.println("Searching for an element in a LinkedList - 2 " + ex.searchElement(2));
		
		ex.display();
		
		System.out.println("Reversing LinkedList");
		ex.head = ex.reverse();
		ex.display();
		
		System.out.println("Finding 2nd node from last");
		ListNode nthData = ex.findNthNode(2);
		System.out.println("Value is "+ nthData.data);
		
		System.out.println("Remove Duplicates from Sorted LinkedList");
		ex.insertNodeToLast(1);
		ex.insertNodeToFirst(6);
		ex.insertAtPosition(4, 3);
		ex.display();
		
		ex.removeDuplicatesSorted();
		ex.display();
		
		System.out.println("Reversing the list for reference");
		ex.head = ex.reverse();
		ex.display();
		System.out.println("Insert Node 5 in a sorted linked list");
		ListNode newNode = new ListNode(5);
		ex.insertSorted(newNode);
		ex.display();
		
		System.out.println("Remove 4 from linkedList");
		ex.removeNode(4);
		ex.display();
		
		System.out.println("Checking if linked list has a loop " + ex.checkForLoop(false));
		ex.createALoopInList();
		System.out.println("Checking if linked list has a loop " + ex.checkForLoop(false));
		System.out.println("Removing loop in a linked List " + ex.checkForLoop(true));
		
		
	}
	
}
