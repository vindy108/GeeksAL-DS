package com.vinay.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintMoreThanNByKOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,10,20,30,20,10,10};
		//printMoreThanNByKNaive(arr, 2);
		//printMoreThanNByKEff(arr, 2);
		printMoreThanNByKMoreEff(arr, 2);

	}
	
	/*
	 * Naive sol
	 */
	public static void printMoreThanNByKNaive(int[] arr,int k){
		int n = arr.length;
		Arrays.sort(arr); //sort the input array in asc
		int i=1,count=1;
		
		while(i<n){
			while(arr[i]==arr[i-1]){	// if curr ele is equal to prev ele
				count++;				//increment the count and i
				i++;
			}
			if(count > n/k)			// if count >(n/k), then print the array value
				System.out.println(arr[i-1] + " ");
			count=1;	//set the count=1, and increment the i
			i++;
		}
	}
	
	/*
	 * Eff sol
	 */
	public static void printMoreThanNByKEff(int[] arr,int k){
		int n = arr.length;
		HashMap<Integer,Integer> hm = new HashMap<>();	
		
		for(int x:arr)
			hm.put(x, hm.getOrDefault(x, 0)+1);	//insert the elements in the map and increment its value
		
		for(Map.Entry<Integer, Integer> e : hm.entrySet())	// iterate through the map and check if the value is greater than n/k
			if(e.getValue() > n/k)
				System.out.println(e.getKey() + " ");	// then print the key
		
	}
	
	/*
	 * More eff sol:
	 */
	public static void printMoreThanNByKMoreEff(int arr[], int k){
		int n = arr.length;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
            
            for(int i=0;i<n;i++){		// if the key already present the increment the value
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.getOrDefault(i, 0)+1);
            }
            else if(hm.size()<k-1)	// if the size is less than k-1, then put the new key in map
                hm.put(arr[i],1);
            else
                for(Map.Entry x:hm.entrySet()){	// else decrement the value
                    Integer c=(Integer)x.getValue();
                    hm.put((Integer)x.getKey(),c-1);
                    if((Integer)x.getKey()==0)
                        hm.remove(x.getKey());}
        }
        for(Map.Entry x:hm.entrySet()){
            int count=0;
            for(int i=0;i<n;i++){
                if((Integer)x.getKey()==arr[i])
                    count++;
            
           }
            if(count>n/k)
                System.out.print(x.getKey()+" ");
        }
    }

}
