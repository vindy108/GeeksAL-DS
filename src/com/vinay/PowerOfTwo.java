package com.vinay.bit;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//naivePower(7);
		System.out.println(effPower(32));
	}
	/*
	 * We divide n/2 and then check if the number is odd return false
	 * else when n is 1 return true;
	 */
	public static boolean naivePower(int n){
		if(n == 0)
			return true;
		while(n != 1){
			if(n%2 != 0){
				System.out.println("Not Power of 2");
				return false;}
			n=n/2;
		}
		System.out.println("Power of 2");
		return true;
	}
	/*
	 * Brian Kerringam Algorithm
	 * We unset the only set bit and if the result is zero then the number 
	 * is power of 2 else 
	 * if the result has more set bits then it’s not power of 2
	   We can always unset the right most bit of the number by
	    performing bitwise AND of the number n with n-1.

	 */
	public static boolean effPower(int n){
		return ((n!=0)&&((n &(n-1))==0));
	}

}
