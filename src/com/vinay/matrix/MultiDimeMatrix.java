package com.vinay.matrix;

public class MultiDimeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[][] = {{1,2,3},{4,5,6}};
		//int arr[][]={{1,2,3,4,5},{6,7}};
		//int m = 3,n=2;
		//int arr[][] = new int[m][n];
	/*	int m =3;//jagged array
		int arr[][] = new int[m][];
		
		for(int i=0;i<arr.length;i++){ // loops for each row
			arr[i] = new int[i+1];
			for(int j=0;j<arr[i].length;j++){	// loops for each column in the row
				arr[i][j]=i;
			System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}*/
		
		int arr[][] = {{1,2,3},{4,5,6}};
		passing2d(arr);

	}
	
	public static void passing2d(int[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
		}
		
	}

	
	
}
