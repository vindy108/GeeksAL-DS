package com.vinay.linkedlist;

class DoubleNode{
	int data;
	DoubleNode next;
	DoubleNode prev;
	
	DoubleNode(int x){
		data=x;
	}
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleNode head = new DoubleNode(10);
		DoubleNode temp1 = new DoubleNode(20);
		DoubleNode temp2 = new DoubleNode(30);
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		System.out.println(head.data + " " + temp1.data + " " + temp2.data);

	}

}
