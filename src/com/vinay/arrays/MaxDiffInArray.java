package com.vinay.arrays;

public class MaxDiffInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,3,10,6,4,8,1};
		//System.out.println(maxDiffNaive(arr));
		System.out.println(maxDiffEff(arr));
		
	}

	/*
	 * Naive approach
	 */
	public static int maxDiffNaive(int[] arr){
		int n=arr.length;
		int res = arr[1]-arr[0];			// res = 1
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				res = Math.max(res, arr[j]-arr[i]); //loop through and find max
			}
		}
		return res;
	}
	
	/*
	 * Efficient approach
	 */
	public static int maxDiffEff(int[] arr){
		int n= arr.length;				//int[] arr={2,3,10,6,4,8,1};
		int res = arr[1]-arr[0];		//find the diff of first two elements
		int min = arr[0];				// assign min value as frst element
		
		for(int i=1;i<n;i++){
			res = Math.max(res, arr[i]-min);		// find the max of res and array element
			min = Math.min(arr[i], min);			// find the min of min value and arry element
		}
		
		return res;
	}
}
