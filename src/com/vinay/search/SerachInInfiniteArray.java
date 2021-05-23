package com.vinay.search;

public class SerachInInfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,20,30,40,50,60,70,100,200,500};
		//System.out.println(searchInInfiniteNaive(arr,30));
		System.out.println(searchInInfiniteEff(arr,200));

	}

	/*
	 * Naive
	 */
	public static int searchInInfiniteNaive(int[] arr,int x){
		int i=0;
		while(true){
			if(arr[i]==x)
				return i;
			if(arr[i]>x)
				return -1;
			
			i++;
		}
	}
	
	
	/*
	 * Efficient app
	 */
	
	public static int searchInInfiniteEff(int[] arr,int x){
		if(arr[0]==x)		//to check if the first element has the input
			return 0;
		int i=1;
		while(arr[i]<x){ // check if the input element is greater than array element at i*2 index		
			i=i*2;
		}
		if(arr[i]==x)		// if the array element is equal then return index
			return i;
		else
			return binarySearchIter(arr,x,i/2+1,i-1);	// else check for the element bw, previous index/2+1 and index-1
	}

	public static int binarySearchIter(int[] arr, int x, int low, int high) {
		// TODO Auto-generated method stub
		while(low<=high){
			int mid = (low+high)/2;
			
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				high=mid-1;
			else
				low=mid+1;					
			}
		return -1;
		}
	}

