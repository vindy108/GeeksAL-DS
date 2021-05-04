package com.vinay.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,11,40};
		reverseOfArray(arr);

	}
	
	public static void reverseOfArray(int[] arr){
		int n = arr.length;
		int low=0,high=n-1;
		
		while(low < high){
			int temp = arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		for(int i=0;i<n;i++){
		System.out.print(arr[i] + " ");
		}
	}

}
