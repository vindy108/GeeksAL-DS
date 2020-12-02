package com.vinay.mathematics;

public class ComputingPower {

	public static void main(String[] args){
		//int out = powerNaive(5,3);
		  int out = powerRec(5,3);
		System.out.println("Power result is " + out);
		
	}
	/*
	 * Naive approach, where we multiply the base with power value through a loop
	 */
	public static int powerNaive(int x, int n){
		int result=1;
		for(int i=0;i<n;i++){
			result = result*x;
		}
		return result;
	}
	
	/*
	 * Recursive approach
	 * 
	 */
	public static int powerRec(int x, int n){
		if(n==0)
			return 1;
		
		int temp= powerRec(x,n/2);
		temp= temp*temp;
		if(n%2 == 0){
			return temp;
		}
			else
			return temp*x;
							
		}
	}

