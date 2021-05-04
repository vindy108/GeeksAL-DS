package com.vinay.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(3,'A','B','C');

	}
	
	/*
	 * Tower of Hanoi
	 */
	public static void towerOfHanoi(int n, char a, char b, char c){
		
		if(n==1){
			System.out.println(" move 1 from " + a + " to " + c);
			return;
		}
		towerOfHanoi(n-1,a,c,b);
		System.out.println(" move " + n + " from " + a + " to " + c);
		towerOfHanoi(n-1,b,a,c);
	}

}
