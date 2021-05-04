package com.vinay.arrays;

public class MaxConsOnesInBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,1,1,0,1,1,1,1};
		//System.out.println(maxConsNaive(arr));
		System.out.println(maxConsEff(arr));

	}

	/*
	 * Naive app
	 */
	public static int maxConsNaive(int[] arr){
		int n= arr.length;		//find the length of array
		int res = 0;			//initialize res to 0
		
		for(int i=0;i<n;i++){			// for each element in array
			int curr = 0;
			for(int j=i;j<n;j++){		//check for corresponding elements
				if(arr[j]==1)			//if the value is 1 then increment the count else break the loop
					curr++;
				else
					break;
			}
			
			res = Math.max(curr, res);		//to find the max of the consecutive elements
		}
		return res;
	}
	
	/*
	 * Eff app:
	 */
	public static int maxConsEff(int[] arr){
		int n= arr.length;			//int[] arr= {0,1,1,1,0,1,1,1,1};
		int curr=0,res=0;
		
		for(int i=0;i<n;i++){	// we loop for each element, if the value is o, then set curr as zero
			if(arr[i]==0)
				curr=0;
			else{
				curr++;			//if the value is one then check for max of res and curr
				res = Math.max(res, curr);
			}
		}
		return res;
	}
}
