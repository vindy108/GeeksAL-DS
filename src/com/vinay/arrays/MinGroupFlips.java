package com.vinay.arrays;

public class MinGroupFlips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,0,1,1,0,0,1,0,1};
		minGroupFlips(arr);

	}
	
	public static void minGroupFlips(int[] arr){
		int n = arr.length;
		
		for(int i=1;i<n;i++){
			if(arr[i]!=arr[i-1]){		// check if the current elemnt not equal to prev
				if(arr[i]!=arr[0]){		// if yes, check if the value is not equal to arr[0]
					System.out.print("From "+ i + " to ");		// if not equal, then flip starts
				}else{
					System.out.println(i-1 + " end");  //if equal, then flip ends
				}
			}
		}
		
		if(arr[n-1]!=arr[0]){				// if the last array element is not equal to arr[0]
			System.out.println(n-1 + " end");		// then flip the last
		}
	}

}
