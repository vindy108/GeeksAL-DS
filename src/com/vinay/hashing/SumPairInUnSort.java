package com.vinay.hashing;

import java.util.HashSet;

public class SumPairInUnSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,4,3,9};
		//System.out.println(sumPairNaive(arr,13));
		System.out.println(sumPairEff(arr,13));
	}
	
	/*
	 * Naive sol
	 */
	public static boolean sumPairNaive(int[]a,int sum){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++)// check for each pair for the sum
				if(a[i]+a[j]==sum)
					return true;
		}
		return false;
	}
	
	/*
	 * Eff sol
	 */
	public static boolean sumPairEff(int[]a,int sum){
		HashSet<Integer> hs = new HashSet<>();
		for(int x:a){
			if(hs.contains(sum-x))
				return true;
			else
				hs.add(x);
		}
		return false;
	}

}
