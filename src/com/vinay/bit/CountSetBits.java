package com.vinay.bit;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int out = countSetNaive(2);
		int out = countSetBrian(40);
		System.out.println(out);

	}

	/*
	 * Naive sol with time complexity of Theta(Total bit count n)
	 * if n=2 :00..0010 (&)
	 * 1      :00..0001
	 */
	public static int countSetNaive(int n){
		int res = 0;
		while(n > 0){
			res = res + (n & 1);
			n= n >> 1;
		}
		return res;
	}
	
	/*Brian Kerringam's Algorithm
	 * n=40 : 0000..101000
	 * 
	 * When we substract n-1 from a number n, all the bits which are 0 will
	 *  become 1 after last bit set(left most bit set) and left most bit 
	 *  will become 0.
	 *  
	 * 
	 */
	public static int countSetBrian (int n){
		int res =0;
		while(n > 0){
			n = (n&(n-1));
			res ++;
		}
		return res;
		}
	}
	
	

