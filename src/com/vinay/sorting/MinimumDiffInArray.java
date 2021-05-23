package com.vinay.sorting;

import java.util.Arrays;

public class MinimumDiffInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,3,20,12};
		//System.out.println(minDiffNaive(arr));
		System.out.println(minDiffEff(arr));

	}
	
	/*
	 * Naive sol
	 */
	public static int minDiffNaive(int[] arr){
		int n = arr.length;
		int res = Integer.MAX_VALUE;
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				res = Math.min(res, Math.abs(arr[i]-arr[j]));
			}
		}
		return res;
	}
	
	/*
	 * Eff sol
	 */
	public static int minDiffEff(int[] arr){
		int n = arr.length;
		int res = Integer.MAX_VALUE;
		Arrays.sort(arr);
		
		for(int i=1;i<n;i++){
			res = Math.min(res, Math.abs(arr[i]-arr[i-1]));			
		}
		return res;
	}

}
