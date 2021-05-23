package com.vinay.sorting;

import java.util.Arrays;

public class MergeTwoSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		int[] b = {5,6,7,8};
		
		//mergeTwoSortNaive(a,b);
		mergeTwoSortEff(a,b);

	}
	
	/*
	 * Naive sol
	 */
	public static void mergeTwoSortNaive(int[]a,int[]b){
		int m = a.length;
		int n = b.length;
		
		int[] c = new int[m+n];		// create a array of size m+n
		
		for(int i=0;i<m;i++){		//copy the elements of first array to c
			c[i]=a[i];
		}
		
		for(int i=0;i<n;i++){	// copy the elements of second array to c	
			c[m+i]=b[i];
		}
		
		Arrays.sort(c);			//sort the array
		
		for(int i=0;i<(m+n);i++){
			System.out.print(c[i] + " ");	//print the output
		}
	}
	
	/*
	 * Eff sol
	 */
	public static void mergeTwoSortEff(int[]a,int[]b){
		int m = a.length;  					//int[] a = {1,2,3,4,5};
		int n = b.length;					//int[] b = {5,6,7,8};
		
		int i=0,j=0;
		
		while(i<m  && j<n){	// check for i<m and j<n
			if(a[i]<=b[j]){			// compare the two array values, if less
				System.out.print(a[i]);		//print the array value and increment the count and again compare
				i++;
			}else{
				System.out.print(b[j]);
				j++;
			}
		}
		
		while(i<m){
			System.out.print(a[i]);
			i++;
		}
		while(j<n){
			System.out.print(b[j]);
			j++;
		}
	}

}
