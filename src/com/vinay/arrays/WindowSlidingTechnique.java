package com.vinay.arrays;

public class WindowSlidingTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,8,-30,-5,20,7};
		//System.out.println(maxConsNaive(arr,3));
		System.out.println(maxConsEff(arr,3));
		int[] arr1={15,2,4,8,9,5,10,23};
		System.out.println(maxConsBool(arr1,23));
	}

	
	/*
	 * Naive app
	 */
	public static int maxConsNaive(int[] arr, int k){
		int n = arr.length;
		int max_sum = Integer.MIN_VALUE;
		for(int i=0;i+k-1<n;i++){		//for each consecutive k elements
			int sum=0;
			for(int j=0;j<k;j++){		// add sum of consective k elements
				sum += arr[i+j];
			}
			max_sum= Math.max(sum,max_sum);		// find the max of sum
		}
		return max_sum;
	}
	
	/*
	 * Eff app:
	 */
	public static int maxConsEff(int[] arr,int k){
		int n = arr.length;			//int[] arr= {1,8,-30,-5,20,7};
		int curr_sum=0;				// set the curr_sum to 0
		for(int i=0;i<k;i++){		// we find the sum of first k elements = -21	
			curr_sum +=arr[i];			
		}
		int max_sum = curr_sum;		
		
		for(int i=k;i<n;i++){			// we next find the sum of next consective, by adding the 
			curr_sum += (arr[i]-arr[i-k]);		// next element and sub , i-k elments
			max_sum = Math.max(curr_sum, max_sum);	// find the max of max_sum
		}
		return max_sum;
	}
	
	public static boolean maxConsBool(int[] arr,int sum){
		int n = arr.length;
		int curr_sum=arr[0];
		int start = 0;
		
		for (int i=1;i<n;i++){
			while(curr_sum >sum && start<i-1){
				curr_sum -= arr[start];
				start++;
			}			
			if(curr_sum == sum)
				return true;
			if(i<n){
				curr_sum +=arr[i];
			}
		}
		System.out.println("no sub array found");
		return false;
	}
}
