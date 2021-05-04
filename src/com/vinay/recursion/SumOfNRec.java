package com.vinay.recursion;

public class SumOfNRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNRec(3));
	}
	
	/*
	 * Sum of natural number n*(n+1)/2
	 * Below eg is via recursive method
	 */
	public static int sumOfNRec(int n){
		if(n==0)
			return 0;
		
		return n+sumOfNRec(n-1);	
	}

}
