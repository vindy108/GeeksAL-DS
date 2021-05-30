package com.vinay.matrix;

public class RotateMatrixBy90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,2,3,4},
				 {5,6,7,8},
				 {9,10,11,12},
				 {13,14,15,16}};
		
		//rotateMatrixBy90Naive(arr);
		rotateMatrixBy90Eff(arr);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
	}
	static int n = 4;
	
	/*
	 * Naive sol
	 */
	public static void rotateMatrixBy90Naive(int[][] arr){
		int temp[][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				temp[n-j-1][i]=arr[i][j];//performs the rotation by 90 anticlockwise 
			}
		}
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=temp[i][j];
	}
	
	/*
	 * Eff sol:
	 */
	public static void rotateMatrixBy90Eff(int[][] arr){
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int temp=arr[i][j];  //perform transpose
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		for(int i=0;i<n;i++){
			int low=0,high=n-1;
			while(low<high){		//reverse the rows
				int temp=arr[low][i];		//swap(arr[low][i],arr[high][i])
				arr[low][i]=arr[high][i];
				arr[high][i]=temp;
				low++;
				high--;
			}
		}
	}

}
