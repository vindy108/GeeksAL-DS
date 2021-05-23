package com.vinay.search;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={8,8,6,6,6,4,6};
		System.out.println(majElement(arr));

	}
	
	public static int majElement(int[] arr){
		int n = arr.length;
		int res=0,count=1;
		
		for(int i=1;i<n;i++){		// we will find the candidate 
			if(arr[res]==arr[i])	// check the max repeating element and find any one of its index	
				count++;
			else
				count--;
			if(count==0){
				res=i;
				count=1;
			}
		}
		
		count=0;				// after index is found, check the count of the element,
		for(int i=0;i<n;i++){
			if(arr[res]==arr[i])
				count++;
		}
		if(count > n/2)			// if the element is greater than n/2 then return the index
			return res;
		
		return -1;
		
	}

}
