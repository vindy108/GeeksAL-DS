package com.vinay.linkedlist;

public class InsertAtBeginDLL {

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
		head = insertBeginDLL(head,40);
		printList(head);	

	}

	public static DoubleNode insertBeginDLL(DoubleNode head, int i) {
		// TODO Auto-generated method stub
		DoubleNode temp = new DoubleNode(i);
		temp.next=head;
		if(head!=null)
			head.prev=temp;
		return temp;
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
