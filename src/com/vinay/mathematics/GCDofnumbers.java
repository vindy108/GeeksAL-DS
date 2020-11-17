package com.vinay.mathematics;

public class GCDofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = gcdnaive(10,15);
		System.out.println("Naive gcd " + x);
		
		int  y = gcdeuclid(10,15);
		System.out.println("euclid gcd " +y);
		
		int z = gcdoptim(10,15);
		System.out.println("optim gcd " +z);

	}
	
	public static int gcdnaive(int a , int b){
		int n  = Math.min(a, b);
		
		while(n>0){
			if (a%n ==0 && b%n==0){
			break;
		}
		n --;
	}
		return n;
	}
	
	public static int gcdeuclid(int a , int b){
		
		while(a!=b){
			
			if(a>b){
				a= a-b;
			}else{
				b = b-a;
			}
				
		}
		return a;
	}

	
	public static int gcdoptim(int a, int b){
		
		if(b==0)
			return a;
		
		return gcdoptim(b,a%b);
			
		
	}
}
