package com.vinay.recursion;

public class SubSetsRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subSet("abc","",0);
	}
	
	/*
	 * SubSet of a string using recursion
	 * 
	 */
	
	public static void subSet(String str, String curr, int index){
		
		if(index == str.length()){
			System.out.print(curr + " ");
			return;
		}
		
		subSet(str, curr, index+1);
		subSet(str, curr+str.charAt(index), index+1);
		
	}

}
