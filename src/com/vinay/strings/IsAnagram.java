package com.vinay.strings;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silent";
		
		//System.out.println(isAnagarmNaive(str1, str2));
		System.out.println(isAnagramEff(str1, str2));
		

	}
	
	/*
	 * Naive sol
	 */
	public static boolean isAnagarmNaive(String str1,String str2){
		if(str1.length() != str2.length())
			return false;
		
		char ch1[] = str1.toCharArray();
		Arrays.sort(ch1);
		str1 = new String(ch1);
		
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch2);
		str2 = new String(ch2);
		
		return str1.equals(str2);
	}
	/*
	 * Eff sol:
	 */
	static final int CHAR = 256; // initialize CHAR
	public static boolean isAnagramEff(String str1,String str2){
		
		if(str1.length()!=str2.length())
			return false;
		
		int count[] = new int[CHAR];	// initialize count to CHAR size
		
		for(int i=0;i<str1.length();i++){
			count[str1.charAt(i)]++;	//if str1 and str2 has the character, inrement and decrement
			count[str2.charAt(i)]--;	
		}
		
		for(int i=0;i<CHAR;i++)	
			if(count[i]!=0)			//if equal chars are present then count of chars will be 0
				return false;
		
		return true;
	}

}
