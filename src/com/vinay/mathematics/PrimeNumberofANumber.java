package com.vinay.mathematics;

import java.util.Arrays;

public class PrimeNumberofANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//primeNumbers(25);
			//sieveAlgo(25);
			  sieveOptimized(25);
	}

	/*
	 * To find the prime numbers which is less than input number
	 * Input number is looped from 2 to n and then checked for prime
	 * and value is printed
	 */
	public static void primeNumbers(int n){
		
		for(int i=2;i<=n;i++){
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	/*
	 * We declare the size of Boolean array as isPrime [N+1] and initialize 
	 * the value as true and we mark the multiples of 2, 3 and 5 as false.
	 * The remaining numbers which are true are the prime numbers
	 */
	
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
	/*
	 * Optimized solution, we loop for i*i and eliminate a loop from earlier 
	 * method
	 */
	
	public static void sieveOptimized(int n){
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i=2;i<=n;i++){
			if(isPrime(i)){
				System.out.println(i);
				
				for(int j=i*i;j<=n;j=j+i){
					isPrime[j]=false;
				}
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
