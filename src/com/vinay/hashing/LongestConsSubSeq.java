package com.vinay.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,9,4,3,10};
		//System.out.println(longConsSubSeqNaive(arr));
		System.out.println(longConsSubSeqEff(arr));

	}
	
	/*
	 * Naive sol
	 */
	public static int longConsSubSeqNaive(int[] arr){
		Arrays.sort(arr);	// perform sorting
		int res=1,curr=1;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]+1)	//check if the curr and prevelement value+1 is equal then increment curr
				curr++;
			else if(arr[i]!=arr[i-1]){	// if not equal, check both should not be same like 3,3
				res = Math.max(res, curr);	// check for the res, and set curr to 1
				curr=1;
			}			
		}
		return res;		
	}
	
	/*
	 * Eff sol:
	 */
	public static int longConsSubSeqEff(int[]arr){
		HashSet<Integer> hs = new HashSet<>(); //int[] arr={2,9,4,3,10};
		for(int x : arr)
			hs.add(x);		// insert the array elements in the hashset
		int res=1;
		for(int x:hs){		// for each element in the hashset
			if(hs.contains(x-1)==false){	// check if the previous element of curr is not present 
				int curr=1;
				while(hs.contains(x+curr))	// then set curr=1 and if the element cons is present in the hashset
					curr++;					// then increment the count
				res = Math.max(res, curr);	// return res			
			}
		}
		return res;
	}

}
