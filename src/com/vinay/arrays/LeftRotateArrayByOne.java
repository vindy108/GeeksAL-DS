package com.vinay.arrays;

public class LeftRotateArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		leftRotateByOne(arr);

	}
	
	public static void leftRotateByOne(int[] arr){
		int n= arr.length;
		int temp=arr[0];		// we copy the first value to a temp
		for(int i=1;i<n;i++){
			arr[i-1]=arr[i];	//move the values starting from 1 to n, lower index
		}
		arr[n-1]=temp;			//assign the temp value to last index
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}
	

}
