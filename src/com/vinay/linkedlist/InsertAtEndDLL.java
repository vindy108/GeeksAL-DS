package com.vinay.linkedlist;

public class InsertAtEndDLL {

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
		head = insertEndDLL(head,40);
		printList(head);

	}

	public static DoubleNode insertEndDLL(DoubleNode head, int i) {
		// TODO Auto-generated method stub
		DoubleNode temp=new DoubleNode(i);
		if(head==null)
			return temp;
		DoubleNode curr=head;
		while(curr.next!=null)
			curr = curr.next;
		
		curr.next=temp;
		temp.prev=curr;
		return head;
	}

	public static void printList(DoubleNode head) {
		// TODO Auto-generated method stub
		DoubleNode curr=head;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		System.out.println();
	}

}
