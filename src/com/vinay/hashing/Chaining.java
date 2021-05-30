package com.vinay.hashing;

import java.util.ArrayList;
import java.util.LinkedList;

class Hash{
	int BUCKET;									// declaring the size of the table
	ArrayList<LinkedList<Integer>> table;		// declaring List of linked list
	
	Hash(int b){
		BUCKET = b;									// initializing the size of table
		table = new ArrayList<LinkedList<Integer>>();	// initializing the list
		
		for(int i=0;i<b;i++)							
			table.add(new LinkedList<Integer>());		// creating the empty linkedlist of size b
	}
	
	void insert(Integer k){			// insert operation of hashing
		int i = k % BUCKET;
		table.get(i).add(k);
	}
	
	void delete(Integer k){		// delete operation of hashing
		int i = k % BUCKET;
		table.get(i).remove(k);
	}
	
	boolean search(Integer k){		// search operation of hashing
		int i = k % BUCKET;
		return table.get(i).contains(k);
	}
	
}
		


public class Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash ha = new Hash(7);
		ha.insert(10);
		ha.insert(20);
		ha.insert(15);
		ha.insert(7);
		
		System.out.println(ha.search(10));
		ha.delete(15);
		System.out.println(ha.search(15));
		

	}

}
