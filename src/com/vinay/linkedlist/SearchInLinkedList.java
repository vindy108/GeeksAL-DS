package com.vinay.linkedlist;

public class SearchInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		System.out.println(searchNode(head,30));

	}

	private static int searchNode(Node head, int i) {
		// TODO Auto-generated method stub
		int pos=1;
		Node curr = head;
		while(curr!=null){
			if(curr.data==i)
				return pos;
			else{
				pos++;
				curr = curr.next;
			}
		}
		return -1;
	}

}
