package com.vinay.recursion;

public class JosephusRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(josephusRec(3,3));

	}
	
	/*
	 * Josephus recursion
	 * 
	 */

	public static int josephusRec(int n, int k){
		if(n==1)
			return 0;
		return (josephusRec(n-1,k) + k )%n;
	}
}
