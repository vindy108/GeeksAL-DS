package com.vinay.bit;

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowerSet("abc");

	}
	
	/*
	 * eg: consider, count=7 which is 111
	 * for j=0; 1<<j = 001 , count&(1 <<j) = 001 = a
	 * j=1, 1<<j = 010, count&(1 <<j) =010 = b
	 * j=3, 1<<j = 100, count&(1 <<j) =100 = c
	 * 
	 */
	
	public static void printPowerSet(String str){
		int n = str.length(); // no of char in string
		int pow = (int) Math.pow(2, n); // no of possible subsets of the string
		
		for(int count = 0; count < pow ; count++){ // for each subset
			for(int j=0;j<n;j++){ // check for the string char val 
				if((count & (1 << j))!=0){
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
