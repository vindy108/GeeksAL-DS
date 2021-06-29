package com.vinay.linkedlist;

public class DeleteLastNodeInDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleNode head = new DoubleNode(10);
		DoubleNode temp1 = new DoubleNode(20);
		DoubleNode temp2 = new DoubleNode(30);
		
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		printList(head);
		head = deleteLastDLL(head);
		printList(head);

	}
	
	
	public static DoubleNode deleteLastDLL(DoubleNode head) {
		// TODO Auto-generated method stub
		if(head==null ||head.next==null)
		return null;
		
		DoubleNode curr=head;
		while(curr.next!=null)
			curr=curr.next;
		
		curr.prev.next=null;
		return head;
	}


	public static void printList(DoubleNode head) {
		// TODO Auto-generated method stub
		DoubleNode curr=head;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

}
