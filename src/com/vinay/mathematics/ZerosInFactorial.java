package com.vinay.mathematics;

public class ZerosInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = countNaive(10);
		int out = count(10);
		
		System.out.println("Naive countof zeroes is " +res);
		System.out.println("countof zeroes is " +out);

	}

	
	public static int countNaive(int n){
		int fact = 1;
		for(int i=2;i<=n;i++){
			fact = fact*i;
		}
		
		int result=0;;
		
		while(fact%10 == 0){
			result++;
			fact=fact/10;
		}
		return result;
	}
	
	public static int count(int n){
		int fact=1;
		for(int i=5;i<=n; i=i*5){
			fact = fact*(n/i);
		}
		return fact;
	}
}
