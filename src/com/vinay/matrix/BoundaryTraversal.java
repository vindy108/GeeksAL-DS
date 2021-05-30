package com.vinay.matrix;

public class BoundaryTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,2,3,4},
					 {5,6,7,8},
					 {9,10,11,12},
					 {13,14,15,16}};
		boundaryTraversal(arr);

	}
	static int R = 4, C=4;
	
	public static void boundaryTraversal(int[][] arr){
		if(R==1){
			for(int j=0;j<C;j++)
				System.out.print(arr[0][j] + " ");
		}else if(C==1){
			for(int i=0;i<R;i++)
				System.out.print(arr[i][0] + " ");
		}else{
			for(int j=0;j<C;j++)
				System.out.print(arr[0][j] + " ");
			for(int i=1;i<R;i++)
				System.out.print(arr[i][C-1] + " ");
			for(int j=C-2;j>=0;j--)
				System.out.print(arr[R-1][j] + " ");
			for(int i=R-2;i>=1;i--)
				System.out.print(arr[i][0] + " ");
		}
		
		
	}

}
