package com.vinay.linkedlist;

public class InsertAtEndSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = null;
		head = insertAtEnd(head,10);
		head = insertAtEnd(head,20);
		head = insertAtEnd(head,30);
		printList(head);

	}

	public static void printList(Node head) {
		// TODO Auto-generated method stub
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
	}

	public static Node insertAtEnd(Node head,int i) {
		// TODO Auto-generated method stub
		Node temp = new Node(i);
		if(head == null)
			return temp;
		Node curr=head;
		while(curr.next!=null)
			curr = curr.next;
		curr.next=temp;
		return head;
	}

}
