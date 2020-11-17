package com.vinay.mathematics;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = isPrimeNaive(1035);
		System.out.println("Naive " + a);
		
		boolean b = isPrimeEff(691);
		System.out.println("Eff " + b);
		
		boolean c = isPrimeMoreEff(1031);
		System.out.println("MoreEff " + c);
		

	}
	
	public static boolean isPrimeNaive( int n){
		if(n ==1)
			return false;
		
		for(int i=2;i<=n;i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	/*
	 * N will always have pair x,y
	 * x*y = n
	 * if x<y
	 * x*x<n 
	 * 
	 */
	public static boolean isPrimeEff(int n){
		if(n==1)
			return false;
		for(int i=2; i*i<=n;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
	public static boolean isPrimeMoreEff(int n){
		if(n==1)
			return false;
		
		if(n==2 || n==3)
			return true;
		
		if(n%2 ==0 || n%3==0)
			return false;
		
		for(int i=5; i*i<=n; i=i+6){
			if(n%i==0 || n%(i+2)==0)
				return false;
	}
		return true;
	}
	
}
