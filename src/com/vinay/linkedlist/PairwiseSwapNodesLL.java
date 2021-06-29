package com.vinay.linkedlist;

public class PairwiseSwapNodesLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printList(head);
		//swapList(head);
		head= swapListReference(head);
		printList(head);

	}

	public static Node swapListReference(Node head) {
		// TODO Auto-generated method stub
		
	        if(head==null||head.next==null)
	            return head;
	        Node curr=head.next.next;
	        Node prev=head;
	        head=head.next;
	        head.next=prev;
	        while(curr!=null&&curr.next!=null){
	            prev.next=curr.next;
	            prev=curr;
	            Node next=curr.next.next;
	            curr.next.next=curr;
	            curr=next;
	        }
	        prev.next=curr;
	        return head;
	   
		
	}

	public static void swapList(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr!=null && curr.next!=null){
			//swap(curr.data,curr.next.data);
			int temp=curr.data;
			curr.data=curr.next.data;
			curr.next.data=temp;
			curr = curr.next.next;
		}
		
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
