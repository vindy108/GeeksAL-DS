package com.vinay.linkedlist;

import java.util.HashSet;

public class DetectLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head.next;
		//if(isLoopReference(head)){
		//if(isLoopHash(head)){
		if(isLoopFloyd(head)){
			System.out.println("loop found");
		}else
			System.out.println("no loop");

	}

	public static boolean isLoopFloyd(Node head) {
		// TODO Auto-generated method stub
		Node fast = head;
		Node slow=head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
	}

	public static boolean isLoopHash(Node head) {
		// TODO Auto-generated method stub
		HashSet<Node>hs = new HashSet<Node>();
		for(Node curr=head;curr!=null;curr=curr.next){
			if(hs.contains(curr))
				return true;
			hs.add(curr);
			
		}
		return false;
	}

	public static boolean isLoopReference(Node head) {
		// TODO Auto-generated method stub
		
		Node curr=head;
		Node temp=new Node(0);
		
		while(curr!=null){
			if(curr.next==null)
				return false;
			if(curr.next==temp)
				return true;
			
			Node curr_next=curr.next;
			curr.next=temp;
			curr=curr_next;
		}
		
		return false;
	}

}
