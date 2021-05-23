package com.vinay.sorting;

public class IntersectionOfSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,20,20,40,60};
		int[] b = {2,20,20,40};
		
		//intersectionOfSortNaive(a,b);
		intersectionOfSortEff(a,b);
	}

	/*
	 * Naive sol
	 */
	public static void intersectionOfSortNaive(int[]a , int[]b){
		int m = a.length;
		int n = b.length;
		
		for(int i=0;i<m;i++){
			if(i>0 && a[i]==a[i-1])	// if the array elements in the first is same then continue
				continue;
			
			for(int j=0;j<n;j++){
				if(a[i]==b[j]){		// if arr[i] has element in b[j] print and then break
					System.out.print(a[i] + " ");
				break;
				}
			}
		}
	}
	
	
	/*
	 * Eff sol
	 */
	
	public static void intersectionOfSortEff(int[]a, int[]b){
		int m = a.length;
		int n = b.length;
		
		int i=0,j=0;
		
		while(i<m && j<n){
			if(i>0 && a[i]==a[i-1]){		// merge sort function, and check for duplicates
				i++;
				continue;
			}
			
			if(a[i]<b[j])			// if less, increment i++
				i++;
			else if(a[i]>b[j])			// if more, increment j++
				j++;
			else if(a[i]==b[j]){			// if equal, print the value, and then increment both
				System.out.print(a[i] + " ");
			i++;
			j++;
			}
		}
	}
}
