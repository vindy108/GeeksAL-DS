package com.vinay.sorting;

public class SortArrayTwoTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,-13,18,-10};
		//sortingArrayNaive(arr);
		sortingArrayHoares(arr);
		
		for(int x: arr){
			System.out.print(x + " ");
		}

	}
	
	/*
	 * Naive sol
	 */
	public static void sortingArrayNaive(int[] arr){
		int n = arr.length;
		int[] temp = new int[n];//create a temp array of size n
		int i = 0;
		
		for(int j=0;j<n;j++){
			if(arr[j]<0){		//copy the elements less than 0
				temp[i]=arr[j];
				i++;
			}			
		}
		
		for(int j=0;j<n;j++){
			if(arr[j]>=0){		//then copy the elements greater than 0
				temp[i]=arr[j];
				i++;
			}
		}
		
		for(int j=0;j<n;j++){
			arr[j]=temp[j];		//copy the elements from temp to original array
		}
	}
	
	
	/*
	 * Eff sol
	 */
	public static void sortingArrayHoares(int[]arr){
		int n = arr.length;
		int l = -1, h=n;
		
		while(true){				// Hoares partition
			do{
				l++;
			}while(arr[l]<0);
			do{
				h--;
			}while(arr[h]>=0);
			
			if(l>=h)
				return ;
			
			int temp=arr[l];
			arr[l]=arr[h];
			arr[h]=temp;
		}
	}

}
