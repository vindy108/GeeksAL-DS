package com.vinay.recursion;

public class PalindromeCheckRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abcbba",0,5));

	}
	
	/*
	 * Check for palindrome using recursion via first and last character of a string
	 */
	public static boolean isPalindrome(String str, int start, int end){
		if(start>=end)
			return true;
		return(str.charAt(start)==str.charAt(end))&&(isPalindrome(str,start+1,end-1));
	}

}
