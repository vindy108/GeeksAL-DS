package com.vinay.recursion;

public class SumOfDigitsRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(1234));

	}
	
	/*
	 * To find sumOfDigits using recursion
	 */
	
	public static int sumOfDigits(int n){
		if(n==0)
			return 0;
		return sumOfDigits(n/10)+(n%10);
	}

}
