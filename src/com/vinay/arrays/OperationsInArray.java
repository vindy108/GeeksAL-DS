package com.vinay.arrays;

public class OperationsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(unSortedSearch(arr,5,10));
		
			int arr[] = new int[5], cap = 5, n = 3;

	       arr[0] = 5; arr[1] = 10; arr[2] = 20;
	
			/*System.out.println("Before Insertion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       int x = 7, pos = 2;

	       n = insertionArray(arr, n, x, cap, pos);
	       

	       System.out.println("After Insertion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }*/
	       
	       System.out.println(deletionArray(arr,3,5));

	}
	
	/*
	 * UnSortedSearch to find position of index
	 */
	public static int unSortedSearch(int[] arr, int n, int x){
		for(int i=0; i <n; i++){
			if(arr[i]==x) //if x=10 has been found in array, the return its index
				return i;
		}
			return -1;
		}
	
	/*
	 * Insertion
	 */
	
	public static int insertionArray(int[] arr, int n, int x, int cap, int pos){
		if(n==cap)
			return n;
		
		int index = pos-1; //index = 2-1=1
		
		for(int i = n-1; i>=index; i--){ // i=3-1=2, i>1;i--
			arr[i+1]=arr[i]; //arr[2+1] = arr[2] // shifting the array from position 2 to pos 3.i.e.,
		}						// i.e. 20 from 2 to 3 and 10 from 1 to 2
		arr[index]=x;      // arr[1]=7
		
		return (n+1);
		}
	
	/*
	 * Deletion of array
	 */

	public static int deletionArray(int[] arr,int n, int x){
		int i;
		
		for(i=0;i<n;i++){
			if(arr[i]==x) //to check if the element x is present in array, 10 is present at index 1
				break;
		}
		
		if(i==n)
			return n;  //if the element is not present  , return the size n
		
		for(int j=i; j<n-1;j++) //j=1 ; j<2;j++
			arr[j]=arr[j+1];  //arr[1]=arr[2]
		
		return (n-1); //return 2
	}
	
}

