package com.vinay.matrix;

public class MatrixInSnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printSnakePattern(arr);

	}
	
	public static void printSnakePattern(int[][]arr){
		for(int i=0;i<arr.length;i++){// for each row
			if(i%2==0){
				for(int j=0;j<arr[i].length;j++){	// each column in the row
					System.out.print(arr[i][j] + " ");
					}
			}else{
				for(int j=arr[i].length-1;j>=0;j--){
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
}
