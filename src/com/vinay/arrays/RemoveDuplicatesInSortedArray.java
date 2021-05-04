package com.vinay.arrays;

public class RemoveDuplicatesInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,20,20,30};
		//System.out.println(removeDupNaive(arr,5));
		System.out.println(removeDupEff(arr));
	}
	
	/*
	 * Naive approach
	 */
	public static int removeDupNaive(int[] arr,int n){
		int[] temp = new int[n];		//create a temp array of size n
		temp[0]=arr[0];					// set the first value in temp array
		
		int res=1;						// have the res as 1, since first value is set
		
		for(int i=1;i<n;i++){
			if(temp[res-1]!=arr[i]){ 	//check if the consecutive array value is same as prev, if not
				temp[res]=arr[i];		//then assign the array value to temp array
				res++;					//increment the result by 1
			}
		}
		
		for(int i=0;i<res;i++){
			arr[i]=temp[i];				// to print the final array, loop through the count of result and 
		}
		return res;						//return the distinct elements
	}
	
	/*
	 * Efficient approach
	 */
	public static int removeDupEff(int[] arr){
		int n= arr.length;		//int[] arr={10,20,20,20,30};
		
		int res=1;
		for(int i=1;i<n;i++){
			if(arr[i]!=arr[res-1]){
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
		
	}

}
