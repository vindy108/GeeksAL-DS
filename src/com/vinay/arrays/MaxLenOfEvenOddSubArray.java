package com.vinay.arrays;

public class MaxLenOfEvenOddSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={5,10,20,16,3,8};
		//System.out.println(maxLenNaive(arr));
		System.out.println(maxLenEff(arr));
	}
	
	/*
	 * Naive app
	 */
	public static int maxLenNaive(int[] arr){
		int n = arr.length;
		int res = 1;
		
		for(int i=0;i<n;i++){			//foreach element
			int curr=1;						// min length of  elment is one
			for(int j=i+1;j<n;j++){
				if((arr[j]%2==0 && arr[j-1]%2 !=0)||	// check if the curr and prev is even and odd
				(arr[j]%2!=0 && arr[j-1]%2 ==0)){		// or odd and even
					curr++;								// increment the curr value
				}else
					break;
			}
			res = Math.max(res, curr);				// find the max of res and curr value
		}
		return res;
	}
	
	/* Eff app:
	 * 
	 */
	public static int maxLenEff(int[] arr){
		int n= arr.length;			//int [] arr={5,10,20,16,3,8};
		int res=1, curr=1;			// initialize res and curr element to 1
		
		for(int i=1;i<n;i++){
			if((arr[i]%2==0 && arr[i-1]%2 !=0)||	// check if the curr and prev is even and odd
			   (arr[i]%2!=0 && arr[i-1]%2 ==0)){    // or odd and even
				curr++;								// increment the curr
				res =Math.max(res, curr);			// and check for max of res
			}else
				curr=1;								// else change the curr to 1
		}
		return res;
	}

}
