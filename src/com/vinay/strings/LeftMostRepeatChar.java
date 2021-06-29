package com.vinay.strings;

public class LeftMostRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		//System.out.println(leftMostRepCharNaive(str));
		//System.out.println(leftMostRepCharBetter(str));
		System.out.println(leftMostRepChaEff(str));
		
	}
	
	/*
	 * Naive sol:
	 */
	public static int leftMostRepCharNaive(String str){
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++)
				if(str.charAt(i)==str.charAt(j))	// checks for each character for appearance else returns -1
					return i;
		}
		return -1;
	}

	/*
	 * Better approach
	 */
	static int CHAR=256;
	public static int leftMostRepCharBetter(String str){
		int count[] = new int[CHAR];
		
		for(int i=0;i<str.length();i++)	//increment the count for repeating values
			count[str.charAt(i)]++;
		
		for(int i=0;i<CHAR;i++)
			if(count[str.charAt(i)]>1)//if the count of char > 1 , return the index
				return i;
		
		return -1;
				
	}
	
	/*
	 * Eff app
	 */
	public static int leftMostRepChaEff(String str){
		boolean visited[] = new boolean[CHAR];// initialize the array with false
		
		for(int i=str.length()-1;i>=0;i--){ //from the right side
			if(visited[str.charAt(i)])	// if the char is already visited then return the index on next visit
				return i;
			else
				visited[str.charAt(i)]=true;	// else make the value true on first visit
		}
		return -1;
	}
}
