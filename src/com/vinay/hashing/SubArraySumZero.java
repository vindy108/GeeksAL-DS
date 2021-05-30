package com.vinay.hashing;

import java.util.HashSet;

public class SubArraySumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={4,-3,2,1};
		//System.out.println(subArraySumZeroNaive(arr));
		System.out.println(subArraySumZeroEff(arr));

	}

	/*
	 * Naive sol
	 */
	public static boolean subArraySumZeroNaive(int[]arr){
		for(int i=0;i<arr.length;i++){
			int cur_sum=0;
			for(int j=i;j<arr.length;j++){// to check for the sum within sub array to zero
				cur_sum +=arr[j];
				if(cur_sum==0)
					return true;
			}
		}
		return false;
	}
	
	/*
	 * Eff sol:
	 */
	public static boolean subArraySumZeroEff(int[]arr){
		HashSet<Integer> hs = new HashSet<>();
		int pre_sum=0;
		for(int i=0;i<arr.length;i++){
			pre_sum +=arr[i];			//check for the sum
			if(pre_sum==0)	// if the sum is zero return true
				return true;
			if(hs.contains(pre_sum))// if the table contains the value, return true
				return true;			
			hs.add(pre_sum);//else add the sum to the table
		}
		return false;
	}
}
