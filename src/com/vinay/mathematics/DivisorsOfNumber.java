package com.vinay.mathematics;

public class DivisorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//divisorsNaive(100);
		//divisorsEff(100);
		divisorsMoreEff(100);

	}
	
	
	public static void divisorsNaive(int n){
		
		for(int i=1;i<=n;i++){
			if(n%i == 0){
				System.out.println("Divisors are " + i);
			}
		}
	}
	
	
	public static void divisorsEff(int n){
		
		for (int i=1;i*i<=n;i++){
			if(n%i ==0){
				System.out.println("Divisors are " +i);
			if(i != n%i)
				System.out.println(("Divisors are " + n/i));
				
			}
		}
	}
	
	public static void divisorsMoreEff(int n){
		int i;
		for(i=1;i*i<=n;i++){
			if(n%i==0)
			System.out.println("Divisors are " +i);
		}
		
		for( ;i>=1;i--){
			if(n%i==0)
			System.out.println("Divisor are " + n/i);
		}
	}

}
