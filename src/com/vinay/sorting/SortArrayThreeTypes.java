package com.vinay.sorting;

public class SortArrayThreeTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,2,1,1,2};
		sortArrayEff(arr);
		
		for(int x:arr){
			System.out.print(x + " ");
		}

	}
	
	/*
	 * Eff sol: Dutch flag algorithm
	 */
	public static void sortArrayEff(int[] arr){
		int n = arr.length;
		int low=0,mid=0,high=n-1;
		
		while(mid<=high){
			if(arr[mid]==0){			// if value is zero, swap(arr[low],arr[mid])
				int temp = arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			
			else if(arr[mid]==1){		// 
				mid++;
			}else
			{							// if values is gretaer than 1, swap(arr[mid],arr[high])
				int temp = arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
		}
	}

}
