package com.vinay.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,5,8};
		//bubbleSortNaive(arr);
		bubbleSortEff(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}

	}
	
	/*
	 * Naive sol
	 */
	public static void bubbleSortNaive(int[]arr){
		int n = arr.length;
		
		for(int i=0;i<n-1;i++){			// looping from 0 to n-2 elements
			for(int j=0;j<n-i-1;j++){	// inner loop from 0 to n-i-2 elements	
				if(arr[j]>arr[j+1]){	// if 1st element is greater than next elemet
					int temp=arr[j];		// swapping
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	/*
	 * Opt sol
	 */
	public static void bubbleSortEff(int[] arr){
		int n = arr.length;
		
		for(int i=0;i<n-1;i++){
			boolean swapped=false;		//initialize the swapped to false
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){	// if the array is already sorted or mid sorted, then 
					int temp=arr[j];	// swapped will remain false	
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)	// if false, then break from the loop, no need to check for elements again
				break;
			}
	}

}
