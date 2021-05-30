package com.vinay.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]={10,20,30,20,30,40};
		//System.out.println(countDistinctNaive(arr));
		//System.out.println(countDistinctEff(arr));
		Integer arr[]={10,20,30,20,30,40,50};
		System.out.println(countDistinctMoreeff(arr));

	}

	/*
	 * Naive sol
	 */
	public static int countDistinctNaive(int[] arr){
		int n = arr.length;
		int res=0;
		for(int i=0;i<n;i++){
			boolean flag=false;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){		// if the array contains duplicates, then make the flag true and break
					flag=true;
					break;
				}
			}
			if(flag==false)
				res++;
			
		}
		return res;
	}
	
	/*
	 * Eff sol
	 */
	public static int countDistinctEff(int[] arr){
		int n=arr.length;
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<n;i++)
			hs.add(arr[i]);
		
		return(hs.size());		
	}
	
	/*
	 * More eff
	 */	
	public static int countDistinctMoreeff(Integer[]arr){
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
		return hs.size();		
	}
}
