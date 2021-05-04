package com.vinay.arrays;

public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {7,20,30,15};
		//System.out.println(isSortedNaive(arr));
		System.out.println(isSortedEff(arr));

	}
	
	/*
	 * Naive approach
	 */
	
	public static boolean isSortedNaive(int[] arr){
		for(int i=0;i<arr.length;i++){			// for each element in array
			for(int j=i+1;j<arr.length;j++){	// will check the subsequent elements in array	
				if(arr[j] < arr[i])				// compares if the value is less than the element and returns false
					return false;				
			}			
		}
		return true;
	}
	
	/*
	 * Efficient approach
	 */
	public static boolean isSortedEff(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1])			//compares the element with next element
				return false;
		}
		return true;
	}

}
