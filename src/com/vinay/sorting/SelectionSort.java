package com.vinay.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,5,8,20,2,18};
		//selectionSortNaive(arr);
		selectionSortEff(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}

	}
	
	/*
	 * Naive sol
	 */
	public static void selectionSortNaive(int[] arr){
		int n = arr.length;
		int[] temp = new int[n];		// create an empty array of size n
		
		for(int i=0;i<n;i++){		// for each element
			int min_ind = 0;			// make the index as 0
			for(int j=1;j<n;j++){		// if the array value is less than min_ind, then 
				if(arr[j]<arr[min_ind])
					min_ind=j;			// assign the j value to min_ind
			}
				temp[i]=arr[min_ind];		//copy the values to temp array
				arr[min_ind]=Integer.MAX_VALUE;		// replace the original with infinity
			
		}
		
		for(int i=0;i<n;i++){
			arr[i]=temp[i];
		}
	}
	
	/*
	 * Opt sol
	 */
	public static void selectionSortEff(int[] arr){
		int n = arr.length;
		for(int i=0;i<n-1;i++){			// check got o to n-1 elements
			int min_ind=i;				// mark the min_index to i
			for(int j=i+1;j<n;j++){			// check for i+1 to n-1 unsorted elements
				if(arr[j]<arr[min_ind])		// if arr[j],arr[min_ind]
					min_ind=j;				// min_ind=j
			}
			
			int temp= arr[min_ind];		// swap the elements
			arr[min_ind]=arr[i];
			arr[i]=temp;
		}
		
	}

}
