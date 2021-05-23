package com.vinay.sorting;

import java.util.Arrays;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point arr[] = { new Point(2,7), new Point(3,15), new Point(18,30), new Point(5,10)};
		mergeIntervals(arr);

	}
	
	/*
	 * Eff sol
	 */
	public static void mergeIntervals(Point[] arr){
		int n = arr.length;
		Arrays.sort(arr);		// sorting the array by Comparable interface
		/*for(Point i:arr){
		System.out.println(i.x + " " + i.y);
		}*/
		int res = 0;
		
		for(int i=1;i<n;i++){
			if(arr[res].y >= arr[i].x){		// if the previous array y is > current array x, then 
				arr[res].y = Math.max(arr[res].y,arr[i].y);	// calculate the min and max
				arr[res].x = Math.min(arr[res].x,arr[i].x);
			}else{
				res++;				// else increment the res and copy the array value
			    arr[res]=arr[i];
			}
		}
		
		for(int i=0;i<=res;i++){
			System.out.print(  "[" + arr[i].x + ", " + arr[i].y + "] "); 
			
		}
	}

}
