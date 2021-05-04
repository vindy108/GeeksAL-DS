package com.vinay.recursion;

public class SumSubSetRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,15};
		System.out.println(sumOfSubSet(arr,3,25));

	}
	
	public static int sumOfSubSet(int[] arr, int n, int sum){
		if(n==0)
			return (sum ==0) ? 1 : 0;
		
		return sumOfSubSet(arr,n-1,sum)+sumOfSubSet(arr,n-1,sum-arr[n-1]);
	}

}
