package com.vinay.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("hello"); // add method
		hs.add("I am" );
		hs.add("groot");
		
		System.out.println(hs);
		System.out.println(hs.contains("groot"));//contains method
		
		Iterator<String> i = hs.iterator(); // iterator method
		while(i.hasNext()){
			System.out.print(i.next() + " ");
		}
		
		System.out.println(hs.size());// size method
		
		hs.remove("hello");//remove method
		
		System.out.println(hs.isEmpty());//isEmpty method
		
		for(String x : hs){
			System.out.print(x + " ");
		}
		
		hs.clear();//clear method
		System.out.println(hs.size());
		

	}

}
