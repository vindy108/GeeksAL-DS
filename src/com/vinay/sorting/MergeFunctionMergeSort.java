package com.vinay.sorting;

public class MergeFunctionMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,40,20,30};
		mergeFunctionSort(a,0,2,4);
		

	}
	
	
	public static void mergeFunctionSort(int[]a,int low,int mid,int high){
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int[] left = new int[n1];	// setting up auxiliary arrays
		int[] right = new int[n2];
		
		for(int i=0;i<n1;i++){
			left[i] = a[low+i];
		}
		
		for(int i=0;i<n2;i++){
			right[i]=a[n1+i];
		}
		
		int i=0,j=0,k=0;		//standard merge logic
		
		while(i<n1 && j<n2){
			if(left[i]<=right[j]){
				a[k] = left[i];
				i++;
				k++;
			}else{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		
		while(i<n1){
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k]=right[j];
			j++;
			k++;
		}
		
		for(int x:a){
			System.out.print(x + " ");
		}
		
		
	}

}
