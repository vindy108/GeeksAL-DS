package com.vinay.linkedlist;

public class ReverseDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleNode head = new DoubleNode(10);
		DoubleNode temp1 = new DoubleNode(20);
		DoubleNode temp2 = new DoubleNode(30);
		
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		printList(head);
		head = reverseDLL(head);
		printList(head);

	}

	public static DoubleNode reverseDLL(DoubleNode head) {
		if(head == null || head.next==null)
			return head;
		
		DoubleNode prev=null;
		DoubleNode curr=head;
		
		while(curr!=null){
			prev = curr.prev;
			curr.prev=curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		return prev.prev;
		
		
	}

	public static void printList(DoubleNode head) {
		// TODO Auto-generated method stub
		DoubleNode curr=head;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

}
