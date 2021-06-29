package com.vinay.linkedlist;

public class DeleteFirstNodeInCLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next =head;
		printListDoWhile(head);
		head = deleteAtBegin(head);
		printListDoWhile(head);
	}
	
	private static Node deleteAtBegin(Node head) {
		// TODO Auto-generated method stub
		if(head==null)return null;
		if(head.next ==head) return null;
		
		Node curr=head;
		while(curr.next!=head)
			curr = curr.next;
		curr.next = head.next;
		
		return curr.next;
	}

	public static void printListDoWhile(Node head) {
		// TODO Auto-generated method stub
		if(head==null)
			return;
		
		Node r= head;
		
		do{
			System.out.print(r.data + " ");
			r = r.next;
		}while(r!=head);
		
		System.out.println();
		
	}

}
