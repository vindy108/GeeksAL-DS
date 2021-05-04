package com.vinay.bit;

public class OneOddOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {1,1,1,2,2,2,2};
		//naiveOneOdd(x);
		System.out.println(effOneOdd(x));

	}
	
	/*
	 * Time complexity of the solution is O(n)
	 */
	public static void naiveOneOdd(int[] arr ){
		int n = arr.length;
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(arr[j]==arr[i])
				count++;
			}

			if(count%2 !=0)
				System.out.print(arr[i]);
		}
	}
	
	/*
	 * 
	 * Efficient solution using XOR approach
	 */
	public static int effOneOdd(int[] arr){
		int n = arr.length;
		int res= 0;
		for(int i=0;i<n;i++){
			res = res ^ arr[i];
		}
		return res;
	}
	

}
