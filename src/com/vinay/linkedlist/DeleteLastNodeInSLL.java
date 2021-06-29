package com.vinay.linkedlist;

public class DeleteLastNodeInSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		printList(head);
		head = deleteLastNode(head);
		printList(head);

	}

	public static Node deleteLastNode(Node head) {
		// TODO Auto-generated method stub
		if(head==null)return null;
		if(head.next==null)return null;
		
		Node curr = head;
		while(curr.next.next!=null)
			curr=curr.next;
		curr.next=null;
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
