package com.vinay.linkedlist;

public class InsertAtEndCLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next =head;
		printListDoWhile(head);
		head = insertAtEnd(head,40);
		printListDoWhile(head);

	}

	public static Node insertAtEnd(Node head, int i) {
		// TODO Auto-generated method stub
		Node temp = new Node(i);
		if(head==null){
			temp.next=temp;
		return temp;
		}
		else{
			Node curr=head;
			while(curr.next!=head)
				curr = curr.next;
			curr.next=temp;
			temp.next=head;
		}
		return head;
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
