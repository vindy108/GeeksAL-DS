package com.vinay.search;

public class CountOccInSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,20,20,20,30};
		System.out.println(countOfOcc(arr,20));
		

	}
	
	public static int indexOfFirstIter(int[]arr,int x){
		int n =arr.length;
		int low=0,high=n-1;
		
		while(low<=high){
			int mid = (low+high)/2;
			if(arr[mid]>x)
				high=mid-1;
			else if(arr[mid]<x)
				low=mid+1;
			else{
				if(mid==0 ||arr[mid-1]!=arr[mid])
					return mid;
				else
					high=mid-1;
			}
		}
		return -1;
	}
	
	public static int indexOfLastIter(int[]arr,int x){
		int n =arr.length;
		int low=0,high=n-1;
		
		while(low<=high){
			int mid = (low+high)/2;
			if(arr[mid]>x)
				high=mid-1;
			else if(arr[mid]<x)
				low=mid+1;
			else{
				if(mid==n-1 || arr[mid+1]!=arr[mid])
					return mid;
				else
					low=mid+1;
			}
		}
		return -1;
	}
	
	public static int countOfOcc(int[]arr,int x){
		int n=arr.length;
		int firstOcc = indexOfFirstIter(arr,x);
		//System.out.println(firstOcc);
		if(firstOcc==-1)
			return 0;
		int lastOcc = indexOfLastIter(arr,x);
		//System.out.println(lastOcc);
		return (lastOcc-firstOcc +1);
	}

}
