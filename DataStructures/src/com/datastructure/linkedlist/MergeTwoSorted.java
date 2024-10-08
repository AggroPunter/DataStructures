package com.datastructure.linkedlist;

public class MergeTwoSorted {
	
	ListNode head1 = null;
	ListNode head2 = null;
	
	private void createFirstList() {
		// TODO Auto-generated method stub
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(8);
		
		first.setNext(second);
		second.setNext(third);
		
		head1 = first;
		
	}

	private void createSecondList() {
		// TODO Auto-generated method stub
		ListNode first = new ListNode(3);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(9);
		ListNode fifth = new ListNode(14);
		ListNode sixth = new ListNode(18);
		
		first.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(sixth);
		
		head2 = first;
	}
	
	
	private ListNode mergeTwoLists(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		while(a != null && b != null) {
			if(a.getData() < b.getData()) {
				tail.setNext(a);
				a = a.getNext();
			} else {
				tail.setNext(b);
				b = b.getNext();
			}
			tail = tail.getNext();
		}
		if(a == null) {
			tail.setNext(b);
		}else {
			tail.setNext(a);
		}
		return dummy.getNext();
	}

	
	public static void main(String[] args) {
		MergeTwoSorted merge = new MergeTwoSorted();
		merge.createFirstList();
		merge.createSecondList();
		
		ListNode result = merge.mergeTwoLists(merge.head1, merge.head2);
		ListNode.display(result);
	}




}
