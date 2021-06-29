package com.vinay.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printList(head);
		head=reverseList(head);
		printList(head);
		

	}
	
	public static Node reverseList(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		Node prev=null;
		
		while(curr!=null){
			Node next = curr.next;
			curr.next=prev;
			prev = curr;
			curr=next;
		}
		return prev;
		
	}

	public static void printList(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

}
