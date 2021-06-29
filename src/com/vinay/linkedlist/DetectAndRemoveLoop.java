package com.vinay.linkedlist;

public class DetectAndRemoveLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head.next;
		//printList(head);
		detectAndRemoveLoop(head);
		printList(head);

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

	public static void detectAndRemoveLoop(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast =head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast==slow)
				break;
		}
		
		if(fast!=slow)
			return;
		
		slow=head;
		while(slow.next!=fast.next){
			slow = slow.next;
			fast = fast.next;
		}
		fast.next=null;
	}

}
