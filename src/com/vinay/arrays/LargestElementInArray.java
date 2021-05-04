package com.vinay.arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1000,500,30,40};
		//System.out.println(largestElementNaive(arr));
		System.out.println(largestElementEff(arr));

	}
	/*
	 * To find the index of largest element in array- Naive
	 */
	public static int largestElementNaive(int[] arr){
		int n = arr.length;
		
		for(int i=0; i<n; i++){  // will loop for individual array element
			boolean flag = true;
			for(int j=0; j<n; j++){		// will loop for each of array element
				if(arr[j] > arr[i]){	//compares for ith element for every jth element
					flag=false;
					break;
				}
			}
			if(flag==true)
			return i;
		}
		return -1;
	}
	
	/*
	 * Efficient approach
	 */
	
	public static int largestElementEff(int[] arr){
		int n = arr.length;
		int res=0;
		
		for(int i=1;i<n;i++){
			if(arr[i]>arr[res]){ //We compare the res element to first and change the res index
				res=i;
			}
		}
		return res;
	}

}
