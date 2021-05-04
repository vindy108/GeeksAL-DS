package com.vinay.recursion;

public class PrintNToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNToOne(4);
	}
	
	public static void printNToOne(int n){
		if(n==0)
			return;
		System.out.print(n + " ");
		printNToOne(n-1);
		
	}

}
