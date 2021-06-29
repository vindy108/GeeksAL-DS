package com.vinay.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Node head=new Node('g');
	    	head.next=new Node('f');
	    	head.next.next=new Node('g');
	    	//if(isPalindrome(head)
	    	if(isPalindromeEff(head))
	    	    System.out.print("Yes");
	    	else
	    	    System.out.print("No");

	}

	public static boolean isPalindrome(Node head) {
		// TODO Auto-generated method stub
		Deque<Character> stack = new ArrayDeque<Character>();
		for(Node curr=head;curr!=null;curr=curr.next)
			stack.push((char) curr.data);
		
		for(Node curr=head;curr!=null;curr=curr.next){
			if(stack.pop()!=curr.data){
				return false;
			}
		}
		return true;
	}
	
  public static Node reverseList(Node head){
        if(head==null||head.next==null)return head;
        Node rest_head=reverseList(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    
   public static boolean isPalindromeEff(Node head){
        if(head==null)return true;
        Node slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node rev=reverseList(slow.next);
        Node curr=head;
        while(rev!=null){
            if(rev.data!=curr.data)
                return false;
            rev=rev.next;
            curr=curr.next;
        }
        return true;
    }

}
