package com.vinay.hashing;

import java.util.HashMap;

public class CountDisEleInWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,20,10,30,40,10};
		int k =4;
		//countDisEleNaive(arr, k);
		countDisEleEff(arr, k);

	}
	
	/*
	 * Naive sol:
	 */
	public static void countDisEleNaive(int[] arr, int k){
		int n = arr.length;
		for(int i=0;i<=n-k;i++){	// for each n-k elements //10,20,20,10
			int count=0;			// set count to 0
			for(int j=0;j<k;j++){	// for each k element//10,20,20,10	
				boolean flag=false;	
				for(int p=0;p<j;p++){ // check for each of the element in k elements
					if(arr[i+j]==arr[i+p]){// if each element is equal to cons elements if 10 is presnt in 20,20,10
						flag=true;	//set flag to true and break
						break;
					}
				}
				if(flag==false)
				count++;				// else incrmenet the count
			}	
			System.out.println(count + " ");
		}
		
		
	}
	
	public static void countDisEleEff(int arr[], int k)
    {
		int n = arr.length;
        HashMap<Integer, Integer> hm=new HashMap<>(); 
       
        for (int i = 0; i < k; i++) { 
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); 
        } 
       
        System.out.print(hm.size()+" "); 
       
        for (int i = k; i < n; i++) { 
            
            hm.put(arr[i - k],  hm.get(arr[i - k]) - 1);
            
            if (hm.get(arr[i - k]) == 0) { 
                hm.remove(arr[i-k]); 
            }   
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            
            System.out.print(hm.size()+" "); 
        } 
    }

}
