package com.vinay.arrays;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,10,4,10,6,5,2};
		//leaderInArrayNaive(arr);
		leaderInArrayEff(arr);
	}
	
	/*
	 * Naive approach
	 */
	public static void leaderInArrayNaive(int[] arr){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			boolean flag=false;				//initialize falg=false;
			for(int j=i+1;j<n;j++){			//loop for i+1 elements
				if(arr[i]<=arr[j]){		// if the ith element is less than subsequents elements
					flag=true;			// return true and break
					break;
				}
			}
			if(flag==false)
				System.out.print(arr[i] + " ");// IF FALSE, print the values
		}
	}
	
	/*
	 * Efficient app:
	 */
	public static void leaderInArrayEff(int[] arr){
		int n = arr.length;
		int curr_lead = arr[n-1];				// last element in array will be the leader
		System.out.print(curr_lead + " ");
		
		for(int i=n-2;i>=0;i--){
			if(curr_lead<arr[i]){				// compare the curr_lead element to previous if its is less,
				curr_lead=arr[i];				// assign the new value as curr_lead
				System.out.print(curr_lead + " ");
			}
		}
		
	}

}
