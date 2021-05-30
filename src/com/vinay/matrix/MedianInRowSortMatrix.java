package com.vinay.matrix;

import java.util.Arrays;

public class MedianInRowSortMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = {{5,10,20,30,40},{1,2,3,4,6},{11,13,15,17,19}};
		System.out.print(medianInRowSortMatrix(arr));

	}
	
	static int R=3,C=5;
	public static int medianInRowSortMatrix(int[][] arr){
		int min = arr[0][0];
		int max = arr[0][C-1];
		
		for(int i=0;i<R;i++){			//find the min and max elementin the matrix
			if(arr[i][0]< min){
				min = arr[i][0];
			}
			if(arr[0][C-1]>max){
				max = arr[0][C-1];
			}
		}
		
		int medPos = (R*C+1)/2;		//find the median Position
		
		while(min<max){
			int mid = (min+max)/2;		//find the mid value
			int midPos=0;
						
			for(int i=0;i<R;i++){
				int pos = Arrays.binarySearch(arr[i], mid)+1;
				midPos += Math.abs(pos);	//find the midPos
			}
			
			if(midPos<medPos)//if midPos is less than medianPos, check in left or right
				min = mid+1;
			else
				max = mid;
		}
		
		return min;
		
		
	}

}
