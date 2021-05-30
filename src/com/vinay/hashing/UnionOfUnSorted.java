package com.vinay.hashing;

import java.util.HashSet;

public class UnionOfUnSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,10,30,20};
		int[] b={20,10,10,40};
		
		System.out.println(unionOfUnSort(a,b));

	}
	
	public static int unionOfUnSort(int[]a,int[]b){
		HashSet<Integer> hs = new HashSet<>();
		
		for(int x: a)
			hs.add(x);		//add the first array elements
		
		for(int y: b)
			hs.add(y);		//add the second array elements
		
		return hs.size();		// return the distinct elements of both the union
	}

}
