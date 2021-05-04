package com.vinay.arrays;

public class FreqInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,10,10,20,20,30,40};
		freqInArray(arr);

	}
	
	public static void freqInArray(int[] arr){
		int n=arr.length;
		int i=1, freq=1;			//initialize the freq as 1 for first element and i=1
		
		while(i<n){
			while(i<n && arr[i]==arr[i-1]){ // if the elements are equal
				freq++;						// increment the freq and i
				i++;
			}
			System.out.println(arr[i-1] + " " + freq); // if not equal, print the array value and its freq
			freq=1;					// initialize the freq to 1
			i++;					// 
		}
		
		if(n==1 ||arr[n-1]!=arr[n-2])		// if only one element and last element is differnet
			System.out.println(arr[n-1]+ " " + 1);		// print the element and occurence is 1
	}

}
