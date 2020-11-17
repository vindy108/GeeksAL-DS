package com.vinay.mathematics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = factIterative(19);
		System.out.println("Iterative result " + res);
		int out = factRecursive(120);
		System.out.println("Recursive result " + out);
		

	}
	
	public static int factIterative(int n){
		int result = 1;
		
		for(int i=2; i<=n ;i++){
			result = result*i;
		}
		
		return result;
	}
	
	public static int factRecursive(int n){
		if(n ==0)
			return 1;
		
		return n*factRecursive(n-1);
	}

}
