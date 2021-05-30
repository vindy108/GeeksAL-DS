package com.vinay.matrix;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,2,3,4},
				 {5,6,7,8},
				 {9,10,11,12},
				 {13,14,15,16}};
		
		//transposeNaive(arr);
		transposeEff(arr);
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}

			System.out.println();
		}

	}
	static int n = 4;
	
	/*
	 * Naive sol
	 */
	public static void transposeNaive(int[][] arr){
		int temp[][] = new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				temp[i][j] = arr[j][i];
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = temp[i][j];
			}
		}
		
	}
	
	/*
	 * Eff sol
	 */
	public static void transposeEff(int[][] arr){
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int temp = arr[i][j];	//swap(arr[i][j],arr[j][i])
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
