package com.vinay.sorting;

public class QuickSortHoares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={8,4,7,9,3,10,5};
		quickSortHoares(arr,0,6);
		
		for(int x : arr){
			System.out.print(x + " ");
		}
	}
	
	public static void quickSortHoares(int[] arr,int l,int h){
		if(l<h){
			int p = hoaresPartition(arr,l,h);
			quickSortHoares(arr,l,p);
			quickSortHoares(arr,p+1,h);
		}
	}

	public static int hoaresPartition(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		int p = arr[l];
		int i = l-1, j=h+1;
		while(true){
			do{
				i++;
			}while(arr[i]<p);
			
			do{
				j--;				
			}while(arr[j]>p);
			
			if(i>=j)
				return j;
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}

}
