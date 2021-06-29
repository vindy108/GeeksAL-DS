package com.vinay.strings;

import java.util.Arrays;

public class LongestSubStrDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abca";
		//System.out.println(longestSubStrDistNaive(str));
		//System.out.println(longestSubStrDistEff(str));
		System.out.println(longestSubStrDistMorEff(str));

	}
	
	/*
	 * Naive sol
	 */
	public static int longestSubStrDistNaive(String str){
		int n = str.length(), res=0;
				
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(isDistinct(str,i,j)){	// to check of the sub-array is distinct
					res = Math.max(res, j-i+1);// then increment the res
				}
			}
		}
		return res;
	}

	public static boolean isDistinct(String str, int i, int j) {
		// TODO Auto-generated method stub
		boolean visited[]=new boolean[256];
		for(int k=i;k<=j;k++){
			if(visited[str.charAt(k)]==true)	// if the sub array has duplicate chars, then return false
				return false;
			visited[str.charAt(k)]=true;
		}
		return true;
	}
	
	/*
	 * Eff sol
	 */
	public static int longestSubStrDistEff(String str){
		int n=str.length(),res=0;
		for(int i=0;i<n;i++){
			boolean visited[]=new boolean[256];
			for(int j=i;j<n;j++){
				if(visited[str.charAt(j)]==true)
					break;
				else
				{
					res = Math.max(res, j-i+1);
					visited[str.charAt(j)]=true;
				}
			}
		}
		return res;
	}
	
	/*
	 * More Eff
	 */
	public static int longestSubStrDistMorEff(String str){
		int n = str.length(), res=0,i=0;
		int prev[]=new int[256];
		Arrays.fill(prev, -1);	// fill the array with -1
		
		for(int j=0;j<n;j++){
			i = Math.max(i,prev[str.charAt(j)+1]);// calc i, for repeating char
			int maxEnd = j-i+1;		//calc maxEnd
			res = Math.max(res, maxEnd);// cal res
			prev[str.charAt(j)]=j;//check for prev char
		}
		return res;
	}
	
	

}
