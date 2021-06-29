package com.vinay.linkedlist;

public class NthNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		//nthNodeFromEnd(head,2);
		nthNodeFromEndTwoRef(head,2);

	}

	public static void nthNodeFromEndTwoRef(Node head, int n) {
		// TODO Auto-generated method stub
		if(head==null)return;
		
		Node first=head;
		for(int i=0;i<n;i++){
			if(first==null)return;
			first=first.next;
		}
		Node second=head;
		while(first!=null){			
			second = second.next;
			first = first.next;
		}
		System.out.println(second.data);		
		
	}

	public static void nthNodeFromEnd(Node head, int n) {
		// TODO Auto-generated method stub
		int len=0;
		for(Node curr=head; curr!=null; curr=curr.next )
			len++;
		if(len<n)
			return;
		
		Node curr=head;
		for(int i=0;i<len-n;i++)
			curr = curr.next;
		System.out.println(curr.data);
	}

}
