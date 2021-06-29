package com.vinay.strings;

public class LeftMostNonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeks";
		//System.out.println(leftMostNonrepCharNaive(str));
		System.out.println(leftMostNonrepCharBetter(str));
	}
	
	/*
	 * Naive sol
	 */
	public static int leftMostNonrepCharNaive(String str){
		for(int i=0;i<str.length();i++){
			boolean flag=false;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){	// if the char match, then return true and break,
					flag=true;
					break;
				}
			}
			if(flag==false)	//if there is no repeating char,then return the index
				return i;
		}
		return -1;
	}
	
	/*
	 * Eff sol:
	 */
	static int CHAR=256;
	public static int leftMostNonrepCharBetter(String str){
		int count[] = new int[CHAR];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;			//stores the count of each char in count array
		
		for(int i=0;i<CHAR;i++)
			if(count[str.charAt(i)]==1)	 //if the count of char is 1, then return index
				return i;
		
		return -1;
		
	}

}
