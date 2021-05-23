package com.vinay.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] arr1 = {5,20,12,10,8};
		char[] arr2 = {'B','A','B','C','A'};*/
		
		/*
		 * Natural order
		 */
		/*Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));*/
		
		/*
		 * Sorting sub array
		 */
		
		/*Arrays.sort(arr1, 1, 4);
		System.out.println(Arrays.toString(arr1));*/
		
		/*
		 * Comparable
		 */
		
		/*Point arr[]={new Point(10,20),new Point(3,12),new Point(5,7)};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].x + " " + arr[i].y);
		}*/
		
		/*
		 * Comparator
		 */
		/*Point arr[]={new Point(10,20),new Point(3,12),new Point(5,7)};
		Arrays.sort(arr, new MyComparator());
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].x + " " + arr[i].y);
		}*/
		
		/*
		 * Wrapper classes for reversal
		 */
		
		/*Integer[] arr={5,2,1,4,10};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));*/
		
		/*
		 * Wrapper classes for comparator for even and then odd
		 */

		/*Integer[] arr = { 1,2,3,4,5};
		Arrays.sort(arr,new MyComparator());
		System.out.println(Arrays.toString(arr));*/
	}

}
