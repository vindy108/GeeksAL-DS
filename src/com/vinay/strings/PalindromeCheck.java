package com.vinay.strings;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCBA";
		//System.out.println(isPalindromeNaive(str));
		System.out.println(isPalindromeEff(str));

	}
	
	/*
	 * Naive sol:
	 */
	public static boolean isPalindromeNaive(String str){
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return str.equals(sb.toString());
	}
	
	/*
	 * Eff sol:
	 */
	public static boolean isPalindromeEff(String str){
		int start = 0;
		int end = str.length()-1;
		
		while(start<end){
			if(str.charAt(start)!=str.charAt(end)) // comapre the char at start and end and then check for next chars
				return false;
			start++;
			end--;
		}
		return true;
	}

}
