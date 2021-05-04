package com.vinay.arrays;

public class MaxCirSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,-2,3,4};
		//int[] arr={8,-4,3,-5,4};
		//System.out.println(maxCirNaive(arr));
		System.out.println(maxCirEff(arr));
	}
	
	/*
	 * Naive app
	 */

	public static int maxCirNaive(int[] arr){
		int n = arr.length;
		int res = arr[0];			// min res will be first element
		
		for(int i=0;i<n;i++){		// for each element in array
			int curr_max = arr[i];		// set the curr_max and curr_sum value to ith element
			int curr_sum = arr[i];
			for(int j=1;j<n;j++){
				int index = (i+j)%n;		// for all the elements
				curr_sum += arr[index];			// calculate the sum
				curr_max = Math.max(curr_sum, curr_max);	// find the max of the element
			}
			res = Math.max(res, curr_max);	// find the max of the res
		}
		return res;
	}
	
	/*
	 * Eff sol:
	 */
	public static int maxCirEff(int[] arr){
		int n = arr.length;					//int [] arr= {5,-2,3,4};
		int max_normal = maxNormEff(arr);
		System.out.println(max_normal);
		if(max_normal < 0)
			return max_normal;
		
		int arr_sum=0;
		for(int i=0;i<n;i++){
			arr_sum +=arr[i];
			arr[i] =-arr[i];
		}
		int max_cir = arr_sum+maxNormEff(arr);
		System.out.println(arr_sum + " " + max_normal + " " + max_cir);
		return Math.max(max_normal, max_cir);
		
	}
	
	public static int maxNormEff(int[] arr){
		int n = arr.length;
		int res = arr[0];
		int maxEnding = arr[0];
		
		for(int i=1;i<n;i++){
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			res = Math.max(res, maxEnding);
		}
		return res;
		
	}
}
