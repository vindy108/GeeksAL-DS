package com.vinay.hashing;

import java.util.HashMap;
import java.util.Map;

public class FreqOfArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,20,30,10};
		//freqInArrNaive(arr);
		freqInArrEff(arr);

	}
	
	/*
	 * Naive sol
	 */
	public static void freqInArrNaive(int[] arr){
		int n = arr.length;
		for(int i=0;i<n;i++){
			boolean flag= false;
			for(int j=0;j<i;j++){		// to check if the element already present
				if(arr[i]==arr[j]){
					flag=true;
					break;
				}
			}
			
			if(flag==true)		// if present, then continue
				continue;
			
			int freq = 1;		//else, check for the element and increment the value
			
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j])
					freq++;
			}
			
			System.out.println(arr[i] + " " + freq);
		}
	}
	
	/*
	 * Eff sol
	 */
	public static void freqInArrEff(int[]arr){
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int x:arr)							// copy the elements to hashmap and increment the value if same key
			hm.put(x, hm.getOrDefault(x, 0)+1);
		
		for(Map.Entry<Integer, Integer> e: hm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}

}
