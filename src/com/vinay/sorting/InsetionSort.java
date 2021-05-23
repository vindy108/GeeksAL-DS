package com.vinay.sorting;

public class InsetionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={20,5,40,60,10,20};
		insertionSort(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}

	}
	
	/*
	 * Insertion sort
	 */
	public static void insertionSort(int[] arr){
		int n = arr.length;
		
		for(int i=1;i<n;i++){		// check from i=1 to n-1
			int key = arr[i];		// assign key = 5
			int j = i-1;			// j = 0
			
			while(j>=0 && arr[j] > key){		//if j>=0 and 20>5
				arr[j+1]=arr[j];				//arr[1] = 20
				j--;							//j=-1
			}
			arr[j+1]=key;					//arr[0]=5
		}
	}

}
