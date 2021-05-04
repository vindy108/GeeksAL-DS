package com.vinay.arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,0,1,2,5};
		//System.out.println(trappingWaterNaive(arr));
		System.out.println(trappingWaterEff(arr));

	}
	
	/* 
	 * Naive sol:
	 */
	public static int trappingWaterNaive(int[] arr){
		int n=arr.length;
		int res=0;
		for(int i=1;i<n-1;i++){		// we traverse through the middle bars
			int lmax = arr[0];		// assign the first element as lmax
			for(int j=0;j<i;j++){
				lmax = Math.max(lmax, arr[j]); //i=1,lmax=3; i=2,lmax=3; i=3,lmax=3
			}
			
			int rmax = arr[0];				//assign the first element as rmax
			for(int j=i+1;j<n;j++){
				rmax = Math.max(rmax, arr[j]); //i=1,rmax=5; i=2,rmax=5; i=3,rmax=5
			}
			
			res +=Math.min(lmax,rmax)-arr[i]; // res = min(5,3)-0 = 3, min(5,3)-1=2,min(5,3)-2 = 1 ::6
		}
		
		return res;
	}
	
	/*
	 * Eff sol:
	 */
	public static int trappingWaterEff(int[] arr){
		int n = arr.length;				//int[] arr={3,0,1,2,5};
		int[] lmax = new int[n];		//initialize the lmax and rmax to input array
		int[] rmax = new int[n];
		int res=0;
		lmax[0]=arr[0];
		
		for(int i=1;i<n;i++){
			lmax[i] = Math.max(arr[i], lmax[i-1]); // find the lmax array by looping for max from left to right
		}											
		
		rmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--){
			rmax[i]=Math.max(arr[i], rmax[i+1]); // find the rmax array by looping for max from right to left
		}
		
		for(int i=1;i<n-1;i++){
		res +=Math.min(lmax[i], rmax[i])-arr[i];	// find the diff of min of array and array element
		}
		
		return res;
	}

}
