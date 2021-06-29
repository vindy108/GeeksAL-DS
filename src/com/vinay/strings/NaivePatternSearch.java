package com.vinay.strings;

public class NaivePatternSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GEEKSFORGEEKS";
		String patt = "EKS";
		//naivePattern(str, patt);
		naivePatternDistinct(str, patt);

	}
	
	/*
	 * Naive sol:
	 */
	public static void naivePattern(String str, String patt){
		int m = str.length();
		int n = patt.length();
		
		for(int i=0;i<=m-n;i++){	// create a sub array
			int j;
			for(j=0;j<n;j++){
				if(patt.charAt(j)!=str.charAt(i+j))// check if the pattern chars match each of the subarray chars
					break;
			}
			if(j==n)			// if match return the char array index
				System.out.println(i + " ");
		}
	}
	
	/*
	 * Eff app
	 */
	public static void naivePatternDistinct(String str,String patt){
		int m  = str.length();
		int n = patt.length();
		
		for(int i=0;i<=m-n;){
			int j;
			for(j=0;j<n;j++){
				if(patt.charAt(j)!=str.charAt(i+j))
					break;
			}
			if(j==n)
				System.out.println(i + " ");
			
			if(j==0)	// if j=0 then there was no pattern match in the subarray, so increment index by1
				i++;
			else
				i=i+j;	// if there was pattern match for few elements in subarray, then increment index by j
		}
	}

}
