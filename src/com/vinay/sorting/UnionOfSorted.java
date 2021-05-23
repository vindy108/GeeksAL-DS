package com.vinay.sorting;

import java.util.Arrays;

public class UnionOfSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,20,20,40,60};
		int[] b = {2,20,20,40};
		
		//unionOfSortNaive(a,b);
		unionOfSortEff(a,b);

	}

	
	/*
	 * Naive sol
	 */
	public static void unionOfSortNaive(int[]a,int[]b){
		int m = a.length;
		int n = b.length;
		
		int[] c= new int[m+n];
		
		for(int i=0;i<m;i++)		// copy both the array values to temp array, c
			c[i]=a[i];
		
		for(int j=0;j<n;j++)
			c[m+j]=b[j];
		
		Arrays.sort(c);			//sort the array
	    
		for(int i=0;i<(m+n);i++){
			if(i==0 || c[i] != c[i-1])		// print only unique elements in the array
				System.out.print(c[i] + " ");
		}
	
	}
	
	/*
	 * Eff sol
	 */
	public static void unionOfSortEff(int[]a,int[]b){
		int m = a.length;
		int n = b.length;
		
		int i=0,j=0;
		
		while(i<m && j <n){
			if(i>0 && a[i]==a[i-1]){		//if the elements are same, increment the index
				i++;
				continue;
			}
			if(j>0 && b[j]==b[j-1]){      //if the elements are same, increment the index
				j++;
				continue;
			}
			if(a[i]<b[j]){
				System.out.print(a[i]+ " ");// print the lowest value and increment index
				i++;
			}else if(a[i]>b[j]){
				System.out.print(b[j]+ " ");// print the lowest value and increment index
				j++;
			}else if(a[i]==b[j]){
				System.out.print(a[i]+ " ");	// if equal , print element and increment both index
				i++;
				j++;
			}
			
		}
		
		while(i < m){
			if(i>0 && a[i]!=a[i-1]){	// in pending if they are not equal, print the element
				System.out.print(a[i] + " ");
				i++;
			}
		}
		while(j < n){
			if(j>0 && b[j]!=b[j-1]){
				System.out.print(b[j] + " ");
				j++;
			}
		}
	}
}
