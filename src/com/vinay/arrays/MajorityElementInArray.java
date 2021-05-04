package com.vinay.arrays;

public class MajorityElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,7,6,8,6,6,6,6};
		//System.out.println(majElementNaive(arr));
		System.out.println(majElementEff(arr));
	}
	
	
	/*
	 * Naive app:
	 */
	public static int majElementNaive(int[] arr){
		int n = arr.length;
		
		for(int i=0;i<n;i++){			
			int count=1;				// set count of each element to 1
			for(int j=i+1;j<n;j++){		// check for each element present in the array
				if(arr[i]==arr[j])		// if same values are present , increment the count
					count++;				
			}
			if(count>n/2)				// if count is greater than n/2, hen return the index else -1
				return i;
		}
		return -1;
	}
	
	public static int majElementEff(int[] arr){
		int res=0,count=1;				//initialize the res as 0 and count as 1
		int n=arr.length;				//int[] arr= {8,7,6,8,6,6,6,6};
		
		for(int i=1;i<n;i++){
			if(arr[res]==arr[i])	// if the array value is equal to consective elements
				count++;			// increment the count
			else
				count--;			//else decrement the count
			
			if(count==0){			// if count reaches 0
				res=i;				// set res to i and count to 1 --> finds the candidate
				count=1;
			}
		}
		
		count=0;					// after selecting the candidate, we loop for each element, if the 
		
		for(int i=0;i<n;i++){
			if(arr[res]==arr[i]){		
				count++;
			}
			if(count >n/2)			// numbers of occurenece is greater than n/2, then return the res else -1
				return res;
		}
		return -1;
		
	}
}
