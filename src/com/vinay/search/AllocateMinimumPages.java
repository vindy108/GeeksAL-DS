package com.vinay.search;

public class AllocateMinimumPages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,20};
		System.out.println(allocateMinPages(arr,2));

	}
	
	public static int  allocateMinPages(int[]arr,int k){
		int n = arr.length;
		int sum = 0,max=0;
		
		for(int i=0;i<n;i++){				// we will find the sum of array and max of array value
			sum +=arr[i];					// sum is 35, max = 20
			max = Math.max(max, arr[i]);
		}
		
		int low= max, high=sum, res=0;	 // we need to find the mid point of low to high		
		
		while(low<=high){
		int mid = (low+high)/2;			//mid = 27			
		if(isFeasible(arr,k,mid)){
			res = mid;
			high = mid-1;
		}else
			low=mid+1;
		}
		return res;
		
	}

	public static boolean isFeasible(int[] arr, int k, int mid) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int req=1,sum=0;
		for(int i=0;i<n;i++){
			if(sum+arr[i]>mid){
				req++;
				sum = arr[i];
			}else
				sum +=arr[i];
		}
		return (req<=k);
	}

}
