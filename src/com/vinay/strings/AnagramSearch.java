package com.vinay.strings;

public class AnagramSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		String patt = "frog";
		//System.out.println(isAnagramPresentNaive(str, patt));
		System.out.println(isAnagramPresentEff(str, patt));
	}

	/*
	 * Naive sol
	 */
	public static boolean isAnagramPresentNaive(String str,String patt){
		int m  = str.length();
		int n = patt.length();
		for(int i=0;i<=(m-n);i++){
			if(isAnagram(patt,str,i))	// check for the pattern if anagram
				return true;
		}
		return false;
	}

	static int CHAR=256;
	public static boolean isAnagram(String patt, String str, int i) {
		// TODO Auto-generated method stub
		int[] count = new int[CHAR];
		
		for(int j=0;j<patt.length();j++){
			count[patt.charAt(j)]++;		// check for string subarray and pattern matches
			count[str.charAt(i+j)]--;
		}
		
		for(int j=0;j<CHAR;j++)
			if(count[j]!=0)
				return false;
		return true;
	}
	
	/*
	 * Eff approach
	 */
	public static boolean isAnagramPresentEff(String str, String patt){
		int[] CT = new int[CHAR];
		int[] CP = new int[CHAR];	// declare two count array for string and pattern
		
		for(int i=0;i<patt.length();i++){
			CT[str.charAt(i)]++;				// insert the str and pattern index in the array
			CP[patt.charAt(i)]++;
		}
		
		for(int i=patt.length();i<str.length();i++){
			if(areSame(CT,CP))							//check if both are same, the return true
				return true;
			
			CT[str.charAt(i)]++;						// increment the next index from string and remove the prev index, then compare
			CT[str.charAt(i-patt.length())]--;
		}
		return false;
	}

	public static boolean areSame(int[] CT, int[] CP) {
		// TODO Auto-generated method stub
		for(int i=0;i<CHAR;i++)
			if(CT[i]!=CP[i])
				return false;
		return true;
	}
}
