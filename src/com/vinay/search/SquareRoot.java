package com.vinay.search;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(squareRootNaive(24));
		System.out.println(squareRootEff(25));

	}
	
	/*
	 * Naive sol
	 */
	public static int squareRootNaive(int x){
		
		int i=1;
		while(i*i<=x)
			i++;
		
		return i-1;
	}
	
	/*
	 * Eff app:
	 */
	public static int squareRootEff(int x){
		int low=1, high = x, res=-1; // initialize values
		
		while(low<=high){
			int mid = (low+high)/2;		//find the mid element
			int midsqr = mid*mid;		// find its square 
			
			if(midsqr == x)				// if midsqr is equal to x, then return the mid value 
				return mid;
			else if(midsqr >x)		//else if midaqr is leass than x, then loop from low to mid-1, left side
				high = mid-1;
			else{
				low=mid+1;		//else, loop to right side, and make res as mid, until the loop
				res = mid;
			}
		}
		return res;
		
	}

}
