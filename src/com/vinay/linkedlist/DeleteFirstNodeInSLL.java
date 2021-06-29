package com.vinay.linkedlist;

public class DeleteFirstNodeInSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		printList(head);
		head = deleteFirstNode(head);
		printList(head);

	}

	public static Node deleteFirstNode(Node head) {
		// TODO Auto-generated method stub
		if(head==null)
			return null;
		
		return head.next;
		
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
