package com.vinay.search;

public class TwoPointerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]arr={2,4,8,9,11,12,20,30};
		//System.out.println(twoPointerAppr(arr,23));
		int[]arr={2,3,4,8,9,20,40};
		
		System.out.println(twoPointerApprForTriplet(arr,25));

	}
	
	/*
	 * Two pointer approach:
	 */
	//public static boolean twoPointerAppr(int[]arr,int sum){
	public static boolean twoPointerAppr(int[]arr,int left,int right,int sum){
		int n = arr.length;
		//int left=0,right=n-1;
		
		while(left<right){
			if(arr[left]+arr[right]==sum)		//if left most and right most element value sum is equal to given sum, then return true
				return true;
			else if(arr[left]+arr[right]>sum)	// if the sum is greater than given, then right most index has to be reduced
				right--;
			else
				left++;  // else increment the left value, if the sum is not equal return false
		}
		return false;
	}
	
	public static boolean twoPointerApprForTriplet(int[]arr,int sum){
		int n = arr.length;
		for(int i=0;i<n;i++){
			if(twoPointerAppr(arr,i+1,n-1,sum-arr[i]))
				return true;
		}
		return false;
	}

}
