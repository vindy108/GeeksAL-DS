package com.vinay.recursion;

public class PrintOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOneToN(5);

	}

	
	public static void printOneToN(int n){
		if(n==0)
			return;
		
		printOneToN(n-1);
		System.out.print(n + " ");
	}
}
