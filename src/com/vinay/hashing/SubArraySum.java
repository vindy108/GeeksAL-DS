package com.vinay.hashing;

import java.util.HashSet;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,8,6,13};
		//System.out.println(subArraySumNaive(arr,14));
		System.out.println(subArraySumEff(arr,14));
		

	}
	
	/*
	 * Naive sol
	 */
	public static boolean subArraySumNaive(int[] arr,int sum){
		for(int i=0;i<arr.length;i++){
			int cur_sum=0;
			for(int j=i;j<arr.length;j++){	// check if the sub array equal to sum
				cur_sum +=arr[j];
				if(cur_sum==sum)
					return true;
			}
		}
		return false;
	}
	
	/*
	 * Eff sol
	 */
	public static boolean subArraySumEff(int[]arr,int sum){
		HashSet<Integer> hs = new HashSet<>();
		int pre_sum=0;
		for(int x:arr){
			pre_sum +=x;			// to find the pre_sum
			if(pre_sum==sum)		// if the sum is equal return true
				return true;
			if(hs.contains(pre_sum -sum)) // if the pre_sum-sum has the value in hashset then return true
				return true;
			hs.add(pre_sum);		//else add in the table
		}
		return false;
	}

}
