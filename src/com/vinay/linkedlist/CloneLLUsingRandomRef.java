package com.vinay.linkedlist;

import java.util.HashMap;

class Node1  
{  
    int data;  
    Node1 next,random;  
    Node1(int x)  
    {  
        data = x;  
        next = random = null;  
    }  
}

public class CloneLLUsingRandomRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 head = new Node1(10); 
        head.next = new Node1(5); 
        head.next.next = new Node1(20); 
        head.next.next.next = new Node1(15); 
        head.next.next.next.next = new Node1(20); 
        
        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;
        
        System.out.print( "Original list : \n"); 
        print(head); 
      
        System.out.print( "\nCloned list : \n"); 
       // Node1 cloned_list = clone(head); 
        Node1 cloned_list = cloneNew(head); 
        print(cloned_list); 

	}

	 public static Node1 clone(Node1 head) {
		// TODO Auto-generated method stub
		 HashMap<Node1,Node1>hm = new HashMap<Node1,Node1>();
		 for(Node1 curr=head;curr!=null;curr=curr.next)
			 hm.put(curr, new Node1(curr.data));
		 
		 for(Node1 curr=head;curr!=null;curr=curr.next){
			 Node1 clonecurr = hm.get(curr);
			 clonecurr.next = hm.get(curr.next);
			 clonecurr.random = hm.get(curr.random);
		 }
		 
		 Node1 head2= hm.get(head);
		 return head2;
	}
	 
	 public static Node1 cloneNew(Node1 head) 
	    { 
	        Node1 next,temp;
	        for(Node1 curr=head;curr!=null;){
	            next=curr.next;
	            curr.next=new Node1(curr.data);
	            curr.next.next=next;
	            curr=next;
	        }
	        for(Node1 curr=head;curr!=null;curr=curr.next.next){
	            curr.next.random=(curr.random!=null)?(curr.random.next):null;
	        }
	        
	         Node1 original = head, copy = head.next; 
	      
	        temp = copy; 
	      
	        while (original!=null && copy!=null) 
	        { 
	            original.next = 
	             original.next!=null? original.next.next : original.next; 
	      
	            copy.next = copy.next!=null?copy.next.next:copy.next; 
	            original = original.next; 
	            copy = copy.next; 
	        } 
	      
	        return temp;
	    }

	public static void print(Node1 start) 
	    { 
	        Node1 ptr = start; 
	        while (ptr!=null) 
	        { 
	            System.out.println ( "Data = " + ptr.data + ", Random  = "+ ptr.random.data ); 
	            ptr = ptr.next; 
	        } 
	    }

}
