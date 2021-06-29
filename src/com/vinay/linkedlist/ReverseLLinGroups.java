package com.vinay.linkedlist;

public class ReverseLLinGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		printList(head);
		head = reverseLLInGroup(head,3);
		printList(head);

	}
	
	private static Node reverseLLInGroup(Node head,int k) {
		// TODO Auto-generated method stub
		Node curr=head, prevFirst=null;
		boolean isFirstPass=true;
		
		while(curr!=null){
			Node first=curr, prev=null;
			int count=0;
			while(curr!=null && count<k){
				Node next = curr.next;
				curr.next=prev;
				prev = curr;
				curr=next;
				count++;
			}
			if(isFirstPass){
				head=prev;
				isFirstPass=false;
			}else{
				prevFirst.next=prev;
			}
			prevFirst=first;
		}
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
