package com.vinay.linkedlist;

public class SortedInsertInLSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		printList(head);
		head = insertInSorted(head,25);
		printList(head);
		head = insertInSorted(head,2);
		printList(head);

	}

	public static Node insertInSorted(Node head, int i) {
		// TODO Auto-generated method stub
		Node temp = new Node(i);
		if(head==null)return temp;
		if(i<head.data){
			temp.next=head;
			return temp;
		}
		Node curr =head;
		while(curr.next!=null && curr.next.data< i)
			curr = curr.next;
		temp.next=curr.next;
		curr.next=temp;
		return head;
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
