package com.vinay.arrays;

public class MaxSumOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,-2,3,-1,2};
		//System.out.println(maxSumNaive(arr));
		System.out.println(maxSumEff(arr));
	}
	
	/*
	 * Naive approach
	 */
	public static int maxSumNaive(int[] arr){
		int n = arr.length;
		int res= arr[0];
		
		for(int i=0;i<n;i++){			//for each element in array
			int curr=0;
			for(int j=i;j<n;j++){			// check for the consecutive elements
				curr = curr+arr[j];				// add the value of cons elements
				res = Math.max(res, curr);		// to update the max of res and curr
			}
		}
		return res;
	}
	
	/*
	 * Eff app:
	 */
	public static int maxSumEff(int[] arr){	//int[] arr={1,-2,3,-1,2};
		int n=arr.length;					// check for length of array
		int res= arr[0];						//initialize res to zeroth element
		int maxEnding = arr[0];					// same for maxending
		
		for(int i=1;i<n;i++){				// we loop for consecutive elements, and check for max of sum and individual element
			maxEnding = Math.max(maxEnding+arr[i],arr[i]);		
			res = Math.max(maxEnding, res);		// we check for max of res
		}
		return res;
	}

}
