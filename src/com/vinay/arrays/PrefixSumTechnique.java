package com.vinay.arrays;

public class PrefixSumTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [] arr={2,8,3,9,6,5,4};
		int prefix_sum[] = prefixSumArray(arr);
		System.out.println(getSum(prefix_sum,0,2));
		System.out.println(getSum(prefix_sum,1,3));
		System.out.println(getSum(prefix_sum,2,6));	*/	
		
		//int[] arr = {3,4,8,-9,20,6};
		//System.out.println(checkEquiNaive(arr));
		//System.out.println(checkEquiEff(arr));
		
		int[] L={1,2,3};
		int[] R={3,5,7};
		System.out.println(maxOcc(L,R));
	}

	/*
	 * Sol 1:
	 */
	public static int[] prefixSumArray(int[] arr){
		int n = arr.length;
		int pre_sum[] = new int[n];	// initialize the sum array to given array length
		pre_sum[0]=arr[0];			// initial sum value be the first array value
		
		for(int i=1;i<n;i++){		// for each element in array
			pre_sum[i] = pre_sum[i-1]+arr[i];	// find the sum of prev element and array value	
		}		
		return pre_sum;
	}
	
	public static int getSum(int[] pre_sum,int l, int r){
		if(l != 0){
			return pre_sum[r]-pre_sum[l-1]; // if l is not 0, then sub element from r index from l-1 index
		}else
			return pre_sum[r];
	}
	

	/*
	 * Naive app
	 */
	public static boolean checkEquiNaive(int[] arr){
		int n=arr.length;				
		
		for(int i=0;i<n;i++){
			int l_sum=0,r_sum=0;	// initialize the left sum and right sum to 0
			for(int j=0;j<i;j++){		// find the left sum value
				l_sum += arr[j];
			}
			for(int j=i+1;j<n;j++){		// find the right sum value
				r_sum =+ arr[j];
			}
			//System.out.println(l_sum + " " + r_sum);
			if(l_sum==r_sum)			// if both are equal at an index, return true	
				return true;
		}
		return false;
	}
	
	/*
	 * Eff app
	 */
	public static boolean checkEquiEff(int[] arr){
		int n= arr.length;
		int sum = 0;
		for(int i=0;i<n;i++){		// find the entire sum
			sum += arr[i];
		}		
		int l_sum=0;				
		for(int i=0;i<n;i++){			//if the l_sum equal to sum and arr value then return true
			if(l_sum == sum-arr[i])
				return true;
			l_sum += arr[i];			//increase the lsum value and decrease the sum value
			sum -= arr[i];
		}
		return false;
	}
	
	public static int maxOcc(int[] L,int[] R){
		int n = L.length;
		int[] arr = new int[1000];
		
		for(int i=0;i<n;i++){
			arr[L[i]]++;
			arr[R[i]+1]--;
		}
		
		int max=arr[0],res=0;
		for(int i=1;i<1000;i++){
			arr[i]  += arr[i-1];
			
			if(max <arr[i]){
				max=arr[i];
				res=i;
			}
		}
		return res;
	}
	
}
