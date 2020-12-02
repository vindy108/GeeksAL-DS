package com.vinay.mathematics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = factIterative(19);
		System.out.println("Iterative result " + res);
		int out = factRecursive(3);
		System.out.println("Recursive result " + out);
		

	}
	
	/*
	 * Factorial is defined for input >= 0 and it is multiplication of all numbers from 1 to n.
	 * n!=n*(n-1)*(n-2)...*1
	 */
	
	public static int factIterative(int n){
		int result = 1;
		
		for(int i=2; i<=n ;i++){
			result = result*i;
		}
		
		return result;
	}
	/*
	 * Recursive approach will not work for input in negative or zero
	 */
	public static int factRecursive(int n){
		if(n == 0)
			return 1;
		
		return n*factRecursive(n-1);
	}

}
