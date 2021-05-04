package com.vinay.recursion;

public class RopeCutRecu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ropeCut(5,2,1,5));
	}
	
	/*
	 * ropeCut using recursion, will recurse through each input and subtract by the value 
	 * and find the max 
	 */
	
	public static int ropeCut(long n, long a, long b, long c){
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		int result = Math.max(ropeCut(n-a,a,b,c),Math.max(ropeCut(n-b,a,b,c),ropeCut(n-c,a,b,c)));
		
		if(result== -1)
			return -1;
		return result+1;
	}

}
