package com.vinay.linkedlist;

public class RemoveDuplicatesInSortedLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(30);
		head.next.next.next.next.next = new Node(30);
		printList(head);
		removeDuplicates(head);
		printList(head);
	}

	public static void removeDuplicates(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr!=null && curr.next!=null){
			if(curr.data==curr.next.data)
				curr.next=curr.next.next;
			else
				curr=curr.next;
		}
		
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
