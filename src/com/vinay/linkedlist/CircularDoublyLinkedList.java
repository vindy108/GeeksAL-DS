package com.vinay.linkedlist;

public class CircularDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleNode head=new DoubleNode(10);
    	DoubleNode temp1=new DoubleNode(20);
    	DoubleNode temp2=new DoubleNode(30);
    	head.next=temp1;
    	temp1.next=temp2;
    	temp2.next=head;
    	temp2.prev=temp1;
    	temp1.prev=head;
    	head.prev=temp2;
		printListDoWhile(head);
		head = insertAtBegin(head,40);
		printListDoWhile(head);
		head = insertAtEnd(head,50);
		printListDoWhile(head);

	}
	
	public static DoubleNode insertAtEnd(DoubleNode head, int i) {
		// TODO Auto-generated method stub
		DoubleNode temp = new DoubleNode(i);
		if(head==null){
			temp.next=temp;
			temp.prev=temp;
			return temp;
		}
		
		temp.prev=head.prev;
		temp.next=head;
		head.prev.next=temp;
		head.prev=temp;
		
		return head;
	}

	public static DoubleNode insertAtBegin(DoubleNode head, int i) {
		// TODO Auto-generated method stub
		DoubleNode temp = new DoubleNode(i);
		if(head==null){
			temp.next=temp;
			temp.prev=temp;
			return temp;
		}
		
		temp.prev=head.prev;
		temp.next=head;
		head.prev.next=temp;
		head.prev=temp;
		
		return temp;
	}

	public static void printListDoWhile(DoubleNode head) {
		// TODO Auto-generated method stub
		if(head==null)
			return;
		
		DoubleNode r= head;
		
		do{
			System.out.print(r.data + " ");
			r = r.next;
		}while(r!=head);
		
		System.out.println();
		
	}

}
