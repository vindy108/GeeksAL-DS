package com.vinay.sorting;

public class QuickSortLomuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={8,4,7,9,3,10,5};
		quickSortLomuto(arr,0,6);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}

	}

	public static void quickSortLomuto(int[]arr,int l, int h){
				
		if(l<h){
			int p = lomutoPartition(arr,l,h);
			quickSortLomuto(arr,l,p-1);
			quickSortLomuto(arr,p+1,h);
		}
		
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
