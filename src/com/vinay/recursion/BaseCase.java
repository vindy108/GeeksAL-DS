package com.vinay.recursion;

public class BaseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fact(4));
		System.out.println(fib(4));

	}
	
	/*
	 * To find the factorial of a number
	 */
	public static int fact(int n){
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	
	/*
	 * To find the nth fibonacci number
	 */
	public static int fib(int n){
		
		//if(n==0) return 0;
		//if(n==1) return 1;
		if(n<=1)
			return n;
		
		return fib(n-1)+fib(n-2);
	}
	
	

}
