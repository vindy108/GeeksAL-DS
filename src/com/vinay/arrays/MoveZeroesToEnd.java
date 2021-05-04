package com.vinay.arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,40,0,0,30,0};
		//moveZeroesNaive(arr);
		moveZeroesEff(arr);

	}
	
	/*Naive approach
	 * 
	 */
	public static void moveZeroesNaive(int[] arr){
		int n = arr.length;
		int temp;
		for(int i=0;i<n;i++){
			if(arr[i]==0){				//if the array value at the index is 0	
				for(int j=i+1;j<n;j++){ // compare the value for the next indexes
					if(arr[j]!=0){		// if there exists non zero value
					temp=arr[i];
					arr[i]=arr[j];		// swap the values
					arr[j]=temp;
					}
					
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i] +" ");
		}
	}
	
	/*
	 * Efficient approach
	 */
	public static void moveZeroesEff(int[] arr){
		int n = arr.length;			//int[] arr = {10,40,0,0,30,0};
		int count = 0;
		int temp;
		
		for(int i=0;i<n;i++){
			if(arr[i]!=0){			// check is the array value is non zero
				temp=arr[i];
				arr[i]=arr[count];	// swaps the value for zero to non zero
				arr[count]=temp;	//eg: arr[4]=30,temp=30,arr[4]=0,arr[2]=30;count=3
				count++;
			}
			
			}
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		}
	
}
