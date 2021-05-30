package com.vinay.hashing;

import java.util.HashMap;

public class LongestCommonSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {0,1,0,0,0,0};
		int[]b = {1,0,1,0,0,1};
		//System.out.println(longestCommonSubArrayNaive(a, b));
		System.out.println(longestCommonSubArrayEff(a, b));

	}
	
	/*
	 * Naive sol
	 */
	public static int longestCommonSubArrayNaive(int[]a,int[]b){		
		int res = 0;
		for(int i=0;i<a.length;i++){
			int sum1=0,sum2=0;
			for(int j=i;j<b.length;j++){
				sum1 += a[j];			// find the sum of both arrays, 
				sum2 += b[j];
				
				if(sum1==sum2)					// if both having common, calc the size of sub-array
					res = Math.max(res, j-i+1);
			}
		}
		return res;
	}
	
	/*
	 * Eff sol:
	 */
	public static int longestCommonSubArrayEff(int[]a,int[]b){
		int[] arr= new int[a.length];
		for(int i=0;i<a.length;i++)
			arr[i] = a[i]-b[i];		// find the diff bw arrays and store the value
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		int sum=0,res=0;
		
		for(int i=0;i<arr.length;i++){
			sum +=arr[i];
			
			if(sum==0)
				res = i+1;
			
			if(hm.containsKey(sum))
				res = Math.max(res, i-hm.get(sum));
			else
				hm.put(sum, i);
			}
		return res;
			
		}
			
		
	}
	

