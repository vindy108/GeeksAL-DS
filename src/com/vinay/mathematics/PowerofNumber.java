package com.vinay.mathematics;

public class PowerofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = powerNaive(2,5);
		System.out.println("The result is " + res);
		
		int sol = powerEff(2,9);
		System.out.println("The sol is " + sol);

	}
	
	public static int powerNaive(int x,int n){
		
		int result = 1;
		for(int i=0;i<n;i++)
			result = result*x;
	return result;	
	}
	
	public static int powerEff(int x, int n){
		if(n==0)
			return 1;
		
		int temp = powerEff(x,n/2);
		temp = temp*temp;
		
		if(n%2==0)
			return temp;
		else
			return temp*x;
	}

}
