package com.vinay.search;

public class Count1sInSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,0,1,1,1,1};
		System.out.println(count1s(arr));

	}
	
	public static int count1s(int[] arr){
		int n = arr.length;
		int low = 0,high=n-1;
		
		while(low<=high){
			int mid = (low+high)/2;
			
			if(arr[mid]==0)			//if the mid element is 0, then we need to check for 1's on right
				low=mid+1;
			else
			{
				if(mid==0 || arr[mid-1]==0)	//if mid index is 0 or mid-1 is equal to 0
					return n-mid;		//return n-mid
				else
					high=mid+1;		//else we need to check for elements on left
			}
		}
		return -1;
	}

}
