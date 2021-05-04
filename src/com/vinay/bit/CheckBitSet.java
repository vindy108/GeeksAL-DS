package com.vinay.bit;

public class CheckBitSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findKBitLeft(39,5);
		findKBitRight(39,5);

	}

	/*
	 * For(5,3)
	 * Using left shift operator
	 * 1=00.....1
	 * n=		  00...101 (&)
	 * 1 << (k-1)=00...100
	 * output    =00...100 Hence Kth bit is set
	 */
	public static void findKBitLeft(int n, int k){
		if((n & (1<<(k-1)))!=0)
			System.out.println("Kth bit is set");
			else
				System.out.println("Kth bit is not set");
			
		}
	/*
	 * For(13,3)
	 * Using right shift operator	 * 
	 * n=		  00..1101 
	 * 1=         00.....1(&)
	 * n >> (k-1)=00..0011
	 * output    =00...001 Hence Kth bit is set
	 */
	public static void findKBitRight(int n , int k){
		if(((n >> (k-1))&1)==1)
			System.out.println("Kth bit is set");
		else
			System.out.println("Kth bit is not set");
	}
	}



