package com.vinay.sorting;

import java.util.Arrays;

public class KthSmallestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={10,5,30,12};
		//System.out.println(kthSmallEleNaive(arr,1));
		System.out.println(kthSmallEleEff(arr,1));
	}
	
	/*
	 * Naive sol
	 */
	public static int kthSmallEleNaive(int[] arr,int k){
				
		Arrays.sort(arr);		
		return arr[k-1];
	}
	
	/*
	 * Eff sol:
	 */
	public static int kthSmallEleEff(int[] arr,int k){
		int n = arr.length;
		int l=0, h=n-1;
		 
		while(l<=h){
			int  p = lomutoPartition(arr,l,h); // find the partition
			if(p == k-1)
				return arr[p];	// if the element is equal to k-1 in the array, then return p
			else if(p > k-1)
				h = p-1;	//else if p > k-1, return h = p-1	
			else
				h = p+1;
		}
		return -1;
	}
	
	public static int lomutoPartition(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		int p = arr[h];
		int i = l-1;
		
		for(int j=l;j<=h-1;j++){
			if(arr[j]< p){
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}			
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		
		return i+1;
	}

}
