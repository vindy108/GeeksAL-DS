package com.vinay.search;

public class IndexOfFirstOccSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,10,15,20,20,20};
		//System.out.println(indexOfFirstRecur(arr,0,5,20));
		System.out.println(indexOfFirstIter(arr,20));
	}
	
	
	/*
	 * Recursive
	 */
	public static int indexOfFirstRecur(int[]arr, int low, int high, int x){
		if(low>high)
			return -1;
		
		int mid = (low+high)/2;
		if (arr[mid]> x)
			return indexOfFirstRecur(arr,low,mid-1,x);
		else if (arr[mid]< x)
			return indexOfFirstRecur(arr,mid+1,high,x);
		else
		{
			if(mid==0 || arr[mid-1]!=arr[mid])
				return mid;
			else
				return indexOfFirstRecur(arr,low,mid-1,x);
		}
	}
	
	/*
	 * Iterative
	 */
	
	public static int indexOfFirstIter(int[]arr,int x){
		int n = arr.length;		//int[] arr={5,10,15,20,20,20};
		int low=0,high=n-1;
		
		while(low<=high){						//3<=5		//3<=3
			int mid = (low+high)/2;		//2		//4			//3
			
			if(arr[mid]>x)
				high = mid-1;
			else if(arr[mid]<x)
				low = mid+1;			//3
			else{
				if(mid==0 || arr[mid-1]!=arr[mid])
					return mid;								//3
				else
					high = mid-1;				//4-1=3
			}
		}
		return -1;
	}

}
