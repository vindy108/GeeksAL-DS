package com.vinay.linkedlist;

public class DeleteNodeWithPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node ptr = new Node(20);
		head.next = ptr;
		head.next.next = new Node(30);
		printList(head);
		deleteNodePointer(ptr);
		printList(head);

	}

	public static void deleteNodePointer(Node ptr) {
		// TODO Auto-generated method stub
		ptr.data = ptr.next.data;
		ptr.next = ptr.next.next;
		
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
