package com.vinay.hashing;

import java.util.HashMap;

public class LongestSubArray0And1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,1,1,0,1,0};
		//System.out.println(longestSubArrayZeroOneNaive(arr));
		System.out.println(longestSubArrayZeroOneEff(arr));

	}
	
	/*
	 * Naive sol
	 */
	public static int longestSubArrayZeroOneNaive(int[]arr){
		int res=0;
		for(int i=0;i<arr.length;i++){
			int c0=0,c1=0;
			for(int j=i;j<arr.length;j++){
				if(arr[j]==1)
					c1++;
				else
					c0++;
				if(c1==c0)
					res = Math.max(res, c0+c1);
			}
			
		}
		return res;
	}
	
	/*
	 * Eff sol:
	 */
	public static int longestSubArrayZeroOneEff(int arr[]) {
		int n=arr.length;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int pre_sum = 0, res = 0;
        for(int i = 0; i < n; i++)  // populating array with -1 for 0 values
         arr[i] = (arr[i] == 0) ? -1 : 1;
         
        for(int i = 0; i < n; i++)
        {
            pre_sum += arr[i];
            if (pre_sum == 0)
             res = i+1;			// if pre_sum=0, then calculate res
             
            if(hm.containsKey(pre_sum + n) == true)
            {
                if(res < i - hm.get(pre_sum + n))
                 res = i - hm.get(pre_sum + n);
                
            }else hm.put(pre_sum + n, i);
        }
        return res;
    }

}
