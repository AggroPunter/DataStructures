package com.datastructure.linkedlist;

/*
 * 3->4->3 reverse 343
 * 5->6->4 reverse 465
 * find sum of 343 + 465 = 808
 * then represent result in linked list 8->0->8 in reverse order
 */
public class ReverseAndSum {

	ListNode head1 = null;
	ListNode head2 = null;
	
	private void createSecondList() {
		ListNode first = new ListNode(7);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(9);
		
		first.setNext(second);
		second.setNext(third);
		
		head1 = first;
		
	}

	private void createFirstList() {
		ListNode first = new ListNode(5);
		ListNode second = new ListNode(6);
		
		first.setNext(second);

		
		head2 = first;
	}
	
	
	private static ListNode findSum(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		while(a != null || b!= null) {
			int x = (a != null) ? a.getData() : 0;
			int y = (b != null) ? b.getData() : 0;
			int sum = x + y + carry;
			carry = sum / 10;
			tail.setNext(new ListNode(sum % 10));
			tail = tail.getNext();
			if(a != null) a = a.getNext();
			if(b != null) b = b.getNext();
		}
		
		if(carry > 0) {
			tail.setNext(new ListNode(carry));
		}
		
		return dummy.getNext();
	}
	
	public static void main(String[] args) {
		ReverseAndSum find = new ReverseAndSum();
		find.createFirstList();
		find.createSecondList();
		ListNode result = findSum(find.head1, find.head2);
		ListNode.display(result);
		
	}




	
}
