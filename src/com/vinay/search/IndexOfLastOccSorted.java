package com.vinay.search;

public class IndexOfLastOccSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,10,15,20,20,20};
		//System.out.println(indexOfLastRecu(arr,0,5,20));
		System.out.println(indexOfLastIter(arr,20));
	}
	
	/*Recursive
	 * 
	 */
	public static int indexOfLastRecu(int[]arr, int low,int high, int x){
		int n =arr.length;
		
		if(low>high)
			return -1;
		
		int mid = (low+high)/2;
		
		if(arr[mid]>x)
			return indexOfLastRecu(arr,low,mid-1,x);
		else if(arr[mid]<x)
			return indexOfLastRecu(arr,mid+1,high,x);
		else{
			if(mid==n-1 ||arr[mid+1]!=arr[mid])
				return mid;
			else
				return indexOfLastRecu(arr,mid+1,high,x);
		}
	}
	
	/*
	 * Iterative
	 */
	public static int indexOfLastIter(int[]arr,int x){
		int n = arr.length;
		int low=0,high=n-1;
		
		while(low<=high){
			int mid = (low+high)/2;
			
			if(arr[mid]>x)
				high = mid-1;
			else if (arr[mid]<x)
				low = mid+1;
			else
			{
				if(mid==n-1 || arr[mid+1]!=arr[mid])
					return mid;
				else
					low=mid+1;
			}
		}
		return -1;
	}

}
