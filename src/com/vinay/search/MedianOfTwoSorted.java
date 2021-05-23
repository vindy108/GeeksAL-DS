package com.vinay.search;

public class MedianOfTwoSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1={30,40,50,60};
		int[]arr2={5,6,7,8,9};
		System.out.println(medianOfArrays(arr1,arr2));

	}
	
	public static int medianOfArrays(int[] arr1, int[] arr2){
		int n1 = arr1.length;
		int n2 = arr2.length;
		int begin1=0,end1=n1;
		
		while(begin1<=end1){
			int mid1 = (begin1+end1)/2;
			int mid2 = (n1+n2+1)/2 -mid1;
			
			int min1 = (mid1==n1)?Integer.MAX_VALUE:arr1[mid1];
			int max1 = (mid1==0)?Integer.MIN_VALUE:arr1[mid1-1];
			
			int min2 = (mid2==n2)?Integer.MAX_VALUE:arr2[mid2];
			int max2 = (mid2==0)?Integer.MIN_VALUE:arr2[mid2-1];
			
			if(max1<=min2 && max2<=min1){
				if((n1+n2)%2 ==0)
					return (Math.max(max1, max2)+Math.min(min1,min2))/2;
				else
					return Math.max(max1,max2);
			}
			else if(max1>min2)
				end1=mid1-1;
			else
				begin1 = mid1+1;

			}
			return -1;
		}
	
		
	}


