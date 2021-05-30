package com.vinay.hashing;

import java.util.HashSet;

public class IntersectionOfUnSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,10,30,20};
		int[] b={20,10,10,40};
		
		//System.out.println(interSecUnSortNaive(a,b));
		System.out.println(interSecUnSortEff(a,b));

	}
	
	/*
	 * Naive sol
	 */
	public static int interSecUnSortNaive(int[] a,int[]b){
		int m = a.length;
		int n = b.length;
		int res=0;
		for(int i=0;i<m;i++){
			boolean flag=false;
			for(int j=0;j<i;j++){		// to check if duplicate elements present in array a, then skip
				if(a[i]==a[j]){
					flag=true;
					break;
				}
			}
			
			if(flag==true)
				continue;
			
			for(int j=0;j<n;j++){
				if(a[i]==b[j]){		// to check if element in array a present in array b, then increment the count on first occurence and break
					res++;
					break;
				}
			}
		}
		return res;
	}
	
	/*
	 * Eff sol
	 */
	public static int interSecUnSortEff(int[]a,int[]b){
		int res=0;
		HashSet<Integer> hs = new HashSet<>();
		for(int x :a)
			hs.add(x);		//add the first array elements to set which will remove dup
		
		for(int y:b){
			if(hs.contains(y)){		// check if array b elements are in hashset
				res++;				//increment the count if present
				hs.remove(y);		// remove the element in hashset to avoid dupliction
			}
		}
		return res;
	}

}
