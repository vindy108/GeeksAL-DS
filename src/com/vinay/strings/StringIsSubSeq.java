package com.vinay.strings;

public class StringIsSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABCDEF";
		String str2 = "ADE";
		System.out.println(isStringSubSeq(str1, str2));

	}
	
	/*
	 * Iterative app
	 */
	public static boolean isStringSubSeq(String str1,String str2){
		int m = str1.length();
		int n = str2.length();
		int j=0;
		for(int i=0;i<m && j<n;i++){
			if(str1.charAt(i)==str2.charAt(j)) //check if str1 contains str2 and has same consec value 
				j++;
		}
		return (j==n);		
	}

}
