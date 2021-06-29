package com.vinay.linkedlist;

public class InsertAtBeginSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
		printListIterative(head);		

	}

	public static Node insertBegin(Node head, int i) {
		// TODO Auto-generated method stub
		Node temp = new Node(i);
		temp.next = head;
		return temp;
	}
	
	public static void printListIterative(Node head) {
		// TODO Auto-generated method stub
		Node curr = head;
		while(curr !=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
	}
	
	

}
