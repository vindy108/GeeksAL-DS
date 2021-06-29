package com.vinay.linkedlist;

public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		//printListIterative(head);
		printListRecursive(head);

	}

	/*
	 * Iterative
	 */
	public static void printListIterative(Node head) {
		// TODO Auto-generated method stub
		Node curr = head;
		while(curr !=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
	}
	
/*
 * Recursive
 */
	public static void printListRecursive(Node head) {
		// TODO Auto-generated method stub
		if(head==null)
			return;
		System.out.print(head.data + " ");
		printListRecursive(head.next);
					
		
	}
	
	
	

}
