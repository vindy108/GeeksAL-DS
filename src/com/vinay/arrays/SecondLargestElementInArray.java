package com.vinay.arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,20,12,20,10};
		//System.out.println(secondLargestNaive(arr));
		System.out.println(secondLargestEff(arr));

	}
	
	
	public static int largestElement(int[] arr){
		int n = arr.length;
		int largest = 0;
		
		for(int i=1;i<n;i++){
			if(arr[i]>arr[largest]) // we will get the index of the largest, which is 1 for the input
				largest=i;
			
		}
		return largest;
	}

	/*
	 * Naive approach
	 */
	
	public static int secondLargestNaive(int[] arr){
		int n= arr.length;
		int largest = largestElement(arr); //largest=1
		int res = -1;
		for(int i=0;i<n;i++){				//for each element in array
			if(arr[i]!=arr[largest]){		// check if each index value not equal to largest index value
				if(res==-1)					// if not, then if res =-1, update the index to ith = 0
					res=i;
				else if(arr[i]>arr[res])	// since 0th index is set, compare if ith(2) value is greater than 0	
					res=i;					// update res=2
					
			}
		}
		return res;
	}
	
	
	/*
	 * Efficient approach
	 */
	
	public static int secondLargestEff(int[] arr){
		int n= arr.length;				//int[] arr = {5,20,12,20,10};
		int res = -1;
		int largest=0;
		
		for(int i=1;i<n;i++){
			if(arr[i]>arr[largest]){	// check for each element to the current largest element
				res=largest;			// second largest index is stored in res //res=0
				largest=i;				//	largest index is stored in largest //largest=1
			}
			else if(arr[i]!=arr[largest]){		//if the value of i is not equal to largest index
				if(res==-1 || arr[i]>arr[res])	//if res index ==-1 or ith value is greater than res // arr[2]>arr[0]
					res=i;						//res=2;
			}
		}
		return res;
	}
}
