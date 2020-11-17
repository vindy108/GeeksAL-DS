package com.vinay.mathematics;

import java.util.Arrays;

public class PrimeNumberofANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//primeNumbers(25);
			sieveAlgo(25);
	}

	public static void primeNumbers(int n){
		
		for(int i=2;i<=n;i++){
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	
	public static void sieveAlgo(int n){
		boolean isPrimeNumber[] = new boolean[n+1];
		Arrays.fill(isPrimeNumber, true);
		
		for(int i=2;i*i<=n;i++){
			if(isPrime(i)){
				for(i=2*i;i<=n;i=i+i)
					isPrimeNumber[i]=false;
			}
		}
		
		for(int i=2;i<=n;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
				
		}
		
	}
	
	public static boolean isPrime(int n){
		if(n==1)
			return false;
		
		if(n==2 || n==3)
			return true;
		
		if(n%2==0 || n%3==0)
			return false;
		
		for(int i=5;i*i<=n;i=i+6){
			if(n%i==0  || n%(i+2)==0)
				return false;
		}
		
		return true;
	}
}
