package com.vinay.recursion;

public class RecursionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//funOne(3);
		//funTwo(3);
		//System.out.println(funThree(16));
		funFour(7);

	}
	
	/**
	 * Recursive function working
	 * fun(3)-->3-->fun(2)-->2-->fun(1)-->1-->fun(0) return 
	 */
	
	public static void funOne(int n){
		if(n==0)
		return ;
		
		System.out.println(n);
		funOne(n-1);
		System.out.println( n);
	}
	
	/*
	 * Recursive function eg 2
	 */
	public static void funTwo(int n){
		if(n==0)
			return;
		
		funTwo(n-1);
		System.out.println(n);
		funTwo(n-1);
	}
	
	public static int funThree(int n){
		if(n==1)
			return 0;
		
		return 1+funThree(n/2);
	}
	
	public static void funFour(int n){
		if(n==0)
			return;
		funFour(n/2);
		System.out.println(n%2);
	}

}
