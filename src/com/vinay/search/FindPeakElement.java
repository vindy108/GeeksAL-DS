package com.vinay.search;

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,7,8,20,12};
		//System.out.println(findPeakEleNaive(arr));
		System.out.println(findPeakEleEff(arr));
	}

	/*
	 * Naive appr
	 */
	public static int findPeakEleNaive(int[] arr){
		int n=arr.length;
		if(n==1)				// if there is one element, return the element
			return arr[0];
		
		if(arr[0]>=arr[1])		// if the first element is greater than second, return first
			return arr[0];
		
		if(arr[n-1]>=arr[n-2])		// if the last element is greater than prev, return last
			return arr[n-1];
		
		for(int i=1;i<n-1;i++){		// compare the middle elements for previous and next to smaller than the element
			if((arr[i]>=arr[i+1]) && (arr[i]>=arr[i-1]))
				return arr[i];
		}
		return -1;
	}
	
	/*
	 * Eff appr:
	 */
	public static int findPeakEleEff(int[] arr){
		int n = arr.length;
		int low=0,high=n-1;
		
		while(low<=high){
			int mid = (low+high)/2;		// find the mid element
			
			if((mid==0 || arr[mid] >=arr[mid-1]) &&	// if the mid is zero or mid is greater than mid-1
			  (mid == n-1 ||arr[mid]>=arr[mid+1])) // and mid is last or mid is greater than mid+1
				return mid;							// return the index
			if(mid>0 && arr[mid]<arr[mid-1])		// if mid >0 and mid is less than previous
				high=mid-1;							// peak might be in the left
			else
				low=mid+1;							// else peak might be in the right
		}
		return -1;
	}
}
