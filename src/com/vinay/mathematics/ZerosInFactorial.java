package com.vinay.mathematics;

public class ZerosInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = countNaive(10);
		int out = count(251);
		
		System.out.println("Naive countof zeroes is " +res);
		System.out.println("count of zeroes is " +out);

	}

	/*
	 * We calculate the factorial of a number and then we calculate the zeros
	 * in the number
	 * 1. To check if the remainder is zero, n%10
	 * 2. increment the count value
	 * 3. Divide the input number by 10, n/10
	 * This approach will result in overflow issues
	 */
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
	
	/*
	 * By using 5 prime factorial, we divide the result by 5 prime factorial
	 * this will not result in overflow issues and has log(n) time complexity
	 */
	public static int count(int n){
		int result=0;
		for(int i=5;i<=n; i=i*5){
			result = result+(n/i);
		}
		return result;
	}
}
