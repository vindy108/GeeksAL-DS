package com.vinay.linkedlist;

public class CircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next =head;
		//printListFor(head);
		printListDoWhile(head);
		

	}

	public static void printListDoWhile(Node head) {
		// TODO Auto-generated method stub
		if(head==null)
			return;
		Node r=head;
		
		do{
			System.out.print(r.data + " ");
			r=r.next;
		}while(r!=head);
		
	}

	public static void printListFor(Node head) {
		// TODO Auto-generated method stub
		if(head==null) return;
		System.out.print(head.data + " ");
		
		for(Node r=head.next; r!=head; r=r.next)
			System.out.print(r.data + " ");		
		
	}

}
