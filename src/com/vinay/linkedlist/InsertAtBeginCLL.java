package com.vinay.linkedlist;

public class InsertAtBeginCLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next =head;
		printListDoWhile(head);
		head = insertAtBegin(head,40);
		printListDoWhile(head);

	}

	public static Node insertAtBegin(Node head, int i) {
		// TODO Auto-generated method stub
		Node temp = new Node(i);
		if(head==null)
			temp= temp.next;
		else{
			Node curr = head;
			while(curr.next!=head)
				curr=curr.next;
			curr.next=temp;
			temp.next=head;
		}
		return temp;
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
