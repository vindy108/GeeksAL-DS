package com.vinay.arrays;

public class LeftRotateArrayByD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		//leftRotateNaive(arr,2);
		//leftRotateBetter(arr,2);
		leftRotateEff(arr,2);
	}

	
	public static void leftRotateByOne(int[] arr){
		int n=arr.length;
		int temp=arr[0];
		
		for(int i=1;i<n;i++){
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
		
	}
	
	/*
	 * Naive approach to call the rotatebyOne d times
	 */
	public static void leftRotateNaive(int[] arr,int d){
		for(int i=0;i<d;i++){
			leftRotateByOne(arr);
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	/*
	 * Better approach
	 */
	public static void leftRotateBetter(int[] arr,int d){
		int n = arr.length;			//int[] arr={1,2,3,4,5};	
		int[] temp = new int[d];
		for(int i=0;i<d;i++){ 		//copy the first d values to temp array
			temp[i]=arr[i];			//{1,2}
		}	
			
		for(int i=d;i<n;i++){
			arr[i-d]=arr[i];		// move the elements from d to n, to 0 to n-d
		}
		
		for(int i=0;i<d;i++){
			arr[n-d+i]=temp[i];		// move the values of temp array to n-d+i
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	/*
	 * Reversal algorithm
	 */
	
	public static void leftRotateEff(int[] arr, int d){
		int n=arr.length;
		
		reverse(arr,0,d-1);		// reverse the first d-1 elements
		reverse(arr,d,n-1);		// reverse the d to n-1 elements
		reverse(arr,0,n-1);		// revrese the whole array
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void reverse(int[] arr,int low,int high){
		while(low<high){
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
}
