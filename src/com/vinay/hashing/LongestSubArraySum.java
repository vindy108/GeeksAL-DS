package com.vinay.hashing;

import java.util.HashMap;

public class LongestSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,2,3,4};
		//System.out.println(longestSubArraySumNaive(arr, 5));
		System.out.println(longestSubArraySumEff(arr, 5));

	}

	/*
	 * Naive sol
	 */
	public static int longestSubArraySumNaive(int[]arr,int sum){
		int res=0;
		for(int i=0;i<arr.length;i++){
			int cur_sum=0;
			for(int j=i;j<arr.length;j++){
				cur_sum +=arr[j];
				if(cur_sum==sum)
					res = Math.max(res,j-i+1);	// to find the max length of given sum
			}
		}
		return res;
	}
	
	/*
	 * Eff sol
	 */
	public static int longestSubArraySumEff(int[]arr,int sum){
		HashMap<Integer,Integer> hm = new HashMap<>();
		int pre_sum=0;
		int res=0;
		for(int i=0;i<arr.length;i++){
			pre_sum  +=arr[i];			// find the pre_sum
			if(pre_sum==sum)			// if pre_sum==sum, return the index
				res +=1;
			if(hm.containsKey(pre_sum)==false)// if the pre_sum key does not exist then put in map
				hm.put(pre_sum, i);
			if(hm.containsKey(pre_sum-sum))// if the diff is present find the index 
				res = Math.max(res, i-hm.get(pre_sum-sum));
		}
		return res;
	}
}
