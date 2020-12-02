package com.vinay.mathematics;

public class LCMofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = lcmnaive(4,6);
		System.out.println("lcm naive " + x);
		
		int y = lcmeuclid(4,6);
		System.out.println("lcm euclid " +y);
	}
	/*
	 * 
	 * LCM of two numbers is max of those two input numbers.
	   If two numbers are co-prime, then LCM is the product of those two numbers.
	 */
	public static int lcmnaive(int a , int b){
		
		int  n = Math.max(a, b);
		
		while(n > 0){
			if(n%a==0 && n%b==0){
				break;
			}
			n++;
		}
		
		return n;
	}
	
	/*
	 * (a*b) = gcd(a,b)*lcm(a,b)
	 * Find the gcd and then,
	 * lcm = (a*b)/gcd(a,b)
	 */
	
	public static int gcdoptim(int a ,int b){
		if(b==0)
			return a;
		return gcdoptim(b,a%b);
	}
	
	public static int lcmeuclid(int a, int b){
		
		int res = (a*b)/gcdoptim(a,b);
		return res;
	}

}
