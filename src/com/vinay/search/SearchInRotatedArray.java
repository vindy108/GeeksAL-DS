package com.vinay.search;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,20,40,60,5,8};
		System.out.println(searchInSortedArray(arr,7));

	}
	
	public static int searchInSortedArray(int[]arr,int x){
		int n =arr.length;
		int low=0,high=n-1;
		
		while(low<=high){
			int mid=(low+high)/2;		// calaculate the mid element and check if the element 
			if(arr[mid]==x)				//is equal to x, then return index
				return mid;
			
			if(arr[low]< arr[mid]){			// check if the left array to mid is sorted
			if(x >=arr[low] && x< arr[mid])	//if yes and if the input is bw low to mid-1	
				high = mid-1;				// then increment the high
			else
				low=mid+1;					// else check for the right side
				}
			
			else{							// if the left most array is not sorted, then right should be sorted	
				if(x> arr[mid]&& x<=arr[high])		// check if the input is bw the right side range
					low=mid+1;						// if preset, then increment the low value
				else
					high=mid-1;						// else, check in the left side
			}
		}
		return -1;
	}

}
