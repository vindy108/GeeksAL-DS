package com.vinay.mathematics;

public class NumberOfDigits {
	
	public static void main (String[] args){
		
		//int out = countDigit(123);
		//int out = countDigitRec(123);
		double out = countDigitLog(123);
		System.out.println("Number of digits " + out);
		
	
}
	/*Iterative solution:
	 * Method iterates through the input number and increments the count
	 * until it reaches zero
	 * eg:123, 
	 * 1st ite:12
	 * 2nd ite:1
	 * 3rd iter:0
	 */
	public static int countDigit(int n){
		int count = 0;
		
		while(n != 0){
			n=n/10;
			count++;
		}		
		return count;
	}
	
	/* Recursive:
	 * For input: 123
	 * 1st call -- 1+count(123/10);=1+2
	 * 2nd call -- 1+count(12/10);=1+1
	 * 3rd call -- 1+count(1/10);==1+0
	 *  
	 */
	public static int countDigitRec(int n){
		while(n == 0)
			return 0;
		
		return 1+countDigitRec(n/10);
	}
	
	/*
	 * Logarithmic:
	 */
	public static double countDigitLog(int n){
		return Math.floor(Math.log10(n)+1);
	}

}
