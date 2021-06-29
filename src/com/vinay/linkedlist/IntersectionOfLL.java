package com.vinay.linkedlist;

import java.util.HashSet;

public class IntersectionOfLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* 
		Creation of two linked lists 
	
		1st 3->6->9->15->30 
		2nd 10->15->30 
	
		15 is the intersection point 
	*/

	Node newNode; 

	Node head1 = new Node(10); 

	Node head2 = new Node(3); 

	newNode = new Node(6); 
	head2.next = newNode; 

	newNode = new Node(9); 
	head2.next.next = newNode; 

	newNode = new Node(15); 
	head1.next = newNode; 
	head2.next.next.next = newNode; 

	newNode = new Node(30); 
	head1.next.next = newNode; 

	head1.next.next.next = null; 
	System.out.print(getIntersectionHash(head1, head2)); 

	}

	public static int getIntersectionHash(Node head1, Node head2) {
		// TODO Auto-generated method stub
		HashSet<Node> hs = new HashSet<Node>();
		Node curr=head1;
		
		while(curr!=null){
			hs.add(curr);
			curr = curr.next;
		}
		
		curr=head2;
		while(curr!=null){
			if(hs.contains(curr))
				return curr.data;
			curr = curr.next;
		}
		return -1;
	}

}
