package com.vinay.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		//System.out.println(binarySearchIter(arr,25));
		System.out.println(binarySearchRecu(arr,0,4,25));
	}

	/*
	 * Iterative app:
	 */
	public static int binarySearchIter(int[] arr, int x){
		int n = arr.length;
		int low = 0, high=n-1;		//initialize low as first index, high as last index
		
		while(low<=high){
			int mid = (low+high)/2;	// find the mid point of the array index
			
			if(arr[mid]==x)			// if the mid value is same as input then return the index
				return mid;
			else if(arr[mid]>x)		// else if the mid value is greater than given value, then search 
				high = mid-1;		// within low to mid-1, elements
			else
				low = mid+1;		// if the mid value is less than given value, then search
		}							// for element within mid+1 to high
		return -1;					// if the element is not present then return zero
	}
	
	/*
	 * Recursive app:
	 * 
	 */
	public static int binarySearchRecu(int[]arr,int low,int high,int x){
						
		if(low>high)				//if the low value is greater than high return -1
			return -1;
		
		int mid = (low+high)/2;			// find the mid value
		
		if(arr[mid]==x)					// if the array element is in mid value, return the index
			return mid;
		else if(arr[mid]>x)				// if the array element is greater than input
			return binarySearchRecu(arr,low,mid-1,x);	// execute low to mid-1
		else
			return binarySearchRecu(arr,mid+1,high,x);	//execute mid+1 to high
	}
}
