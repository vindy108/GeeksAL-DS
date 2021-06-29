package com.vinay.linkedlist;

public class InsertAtGivPosSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printList(head);
		head = insertNodeAtPos(head,4,45);
		printList(head);

	}

	public static Node insertNodeAtPos(Node head, int pos, int data) {
		// TODO Auto-generated method stub
		Node temp = new Node(data);
		if(pos==1){
			temp.next=head;
			return temp;
		}
		Node curr = head;
		for(int i=1; i<=pos-2 && curr!=null;i++)
			curr=curr.next;
		
		if(curr==null)
			return head;
		temp.next = curr.next;
		curr.next = temp;
		
		return head;
		
		
	}

	public static void printList(Node head) {
		// TODO Auto-generated method stub
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
			}
		System.out.println();
	}

}
