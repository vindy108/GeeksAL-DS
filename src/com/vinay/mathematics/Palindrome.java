package com.vinay.mathematics;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(1234321);

	}

	/*
	 * 1. palindrome is seq of numbers when read from either direction should have the same value
	 * 2. To check if a given number is palindrome -- boolean
	 * 3.  eg: 12321 - true
	 *  Last digit= x%10 will give the last digit
		Remainder = x/10 will give remainder.
		rev = rev*10+last digit where rev is initialized to 0
	 *  we need input value n inorder to compare the reversed result, so we store 
	 *  the value in temp
	 */
	public static boolean isPalindrome(int n){
		int rev = 0;
		int temp = n;
		
		while(temp != 0){
			int lastDigit = temp%10;
			rev = rev*10 + lastDigit;
			temp = temp/10;			
		}
		
		if( n == rev){
			System.out.println("The given seq is Palindrome");
			return true;
		}else{
			System.out.println("The given seq is not a palindrome");
		return false;
		}
	}
}
