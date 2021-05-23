package com.vinay.sorting;

public class PartionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,13,6,9,12,11,8};
		//partitionOfArrayNaive(arr,6);
		//lomutoPartition(arr);
		hoaresPartition(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		

	}
	/*
	 * Naive sol
	 */
	public static void partitionOfArrayNaive(int[] arr, int p){
		int n = arr.length;
		int l = 0, h = n-1, index=0;
		
		int[] temp = new int[h-l+1];	//create a temp array	
		
		for(int i=l;i<=h;i++){			//copy the elements less than the pointer index element
			if(arr[i]<=arr[p]){
				temp[index] = arr[i];
				index++;
			}
		}
		
		for(int i=l;i<=h;i++){
			if(arr[i]>arr[p]){			//then copy the elements to greater than pointer index
				temp[index]=arr[i];
				index++;
			}
		}
		
		for(int i=l;i<=h;i++){
			arr[i]=temp[i-l];		//copy the temp array to main array
		}
		
		
	}
	
	/*
	 * Lomuto partition
	 */
	public static int lomutoPartition(int[]arr){
		int n = arr.length;
		int l=0,h=n-1;	
		int p = arr[h];	//assume the pivot to be the last element
		int i = l-1;		// for i =l-1;
		for(int j=l;j<=h-1;j++){
			if(arr[j]< p){		//if the arr element is smaller than pivot
				i++;				//increment the i value, and then perform
				int temp=arr[i];	//swap(arr[i],arr[j]), for j<=h-1	
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[i+1];	// the last element is swap(arr[i+1],arr[h])
		arr[i+1]=arr[h];
		arr[h]=temp;
		return i+1;
	}
	
	/*
	 * Hoares's alogo
	 */
	public static int hoaresPartition(int[]arr){
		int n = arr.length;
		int l=0,h=n-1;
		int p = arr[l];		// we assume partition element to be the first element in the array
		int i = l-1, j=h+1;	// set i= l-1 and j=h+1;
		
		while(true){
			do{
				i++;		/// increment index if arr[i]is less than p
			}while(arr[i]<p);
			
			do{
				j--;		//decrement index if arr[j] is greater than p
			}while(arr[j]>p);
			
			if(i>=j)		//if i >=j, then return j
				return j;
			
			int temp=arr[i];	// else, perform swap(arr[i],arr[j])
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

}
