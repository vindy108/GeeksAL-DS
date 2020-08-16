package com.vinay.mathematics;

public class LengthOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = countOfNumberNaive(12345);
		System.out.println("length of input " + res);
		
		int result = countOfNumberRecursive(746849753);
		System.out.println("Length of input " + result);
		
		int out = (int) countOfNumberLog(156478);
		System.out.println("Length of input " + out);

	}

	
	public static int countOfNumberNaive(int n){
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		return count;
	}
	
	public static int countOfNumberRecursive(int n){
		if(n==0)
			return 1;
		
		return 1+countOfNumberRecursive(n/10);
	}
	
	public static double countOfNumberLog(int n){
		return Math.floor(Math.log10(n)+1);
	}
}
