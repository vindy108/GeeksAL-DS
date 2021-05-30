package com.vinay.matrix;

public class SearchInRowAndColumnSortMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		//searchInSortedMatNaive(arr,50);
		searchInSortedMatEff(arr,15);

	}
	
	/*
	 * Naive sol
	 */
	public static void searchInSortedMatNaive(int[][] arr,int x){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if (arr[i][j]==x){
					System.out.print("Found at C : "+ i + "*" +j);	
				return;
				}
			}
		}
		System.out.print("not found");
	}
	static int R=4,C=4;
	/*
	 * Eff app
	 */
	public static void searchInSortedMatEff(int[][]arr,int x){
		int i=0,j=C-1;
		
		while(i<R && j>=0){ 	// we will start with right end of matrix
			if(arr[i][j]==x){  // if the element is found, print it, 
				System.out.print("Element found at "+ i + "*" + j );
				return;
			}
			else if(arr[i][j] > x)	//if the array value is greater than input, then move left
				j--;
			else
				i++;				//else move down
				
		}
		System.out.print("Not found");
	}

}
