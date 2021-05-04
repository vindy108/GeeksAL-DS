package com.vinay.bit;

public class TwoOddOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x={1,1,1,2,3,3};
		//twoOddNaive(x);
		twoOddEff(x);

	}
	
	/*
	 * Naive solution and time complexity is O(n*n)
	 */
	
	public static void twoOddNaive(int[] arr){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count%2 != 0)
				System.out.print(arr[i]);
		}		
		
	}
	
	/*
	 * Efficient approach;
	 *  Step1: To perform XOR of all the numbers - even appearing will cancel out each other and odd appearing number remains and its XOR provides a value
		Step 2: Consider the set bit of the value and group the input into 2 groups
		Step 3: Group1 will have input values having set bit at the position and group 2 will have input values having no set bit at the position
		Step 4: Now perform XOR of all the inputs in each group , we will get the result
	 */
	
	public static void twoOddEff(int[] arr){
		int n = arr.length;
		int xor=0,res1=0,res2=0;
		for(int i=0;i<n;i++){
			xor = xor ^ arr[i];
		}		
		int sn = xor & ~(xor-1);
		
		for(int i=0;i<n;i++){
			if((arr[i] & sn)!=0)
				res1 = res1^arr[i];
			else
				res2=res2^arr[i];
		}
		
		System.out.print(res1 + " " + res2);
	}
		
	}

