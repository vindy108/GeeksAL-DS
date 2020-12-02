package com.vinay.mathematics;

public class IterativePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int out = iterPow(7,100);
		System.out.println("Iterative power result is " + out);

	}

	/*
	 * In Binary representation, every number can be written as sum of powers of
	 * 2. We multiply the result for odd number and then divide the input/2.
	 */

	public static int iterPow(int x, int n) {
		int result = 1;

		while (n > 0) {
			if (n % 2 != 0) {
				result = result * x;
			}

			x = x * x;
			n = n / 2;
		}
		return result;
	}

}
