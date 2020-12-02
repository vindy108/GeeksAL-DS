package com.vinay.mathematics;

public class GCDofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = gcdnaive(10, 15);
		System.out.println("Naive gcd " + x);

		int y = gcdeuclid(10, 15);
		System.out.println("euclid gcd " + y);

		int z = gcdoptim(10, 15);
		System.out.println("optim gcd " + z);

	}

	/*
	 * The max GCD of 2 input numbers can be min of those 2 numbers We check if
	 * the two input numbers are divided by the common factor, else we decrement
	 * the factor until both inputs are divided by common factor
	 */
	public static int gcdnaive(int a, int b) {
		int n = Math.min(a, b);

		while (n > 0) {
			if (a % n == 0 && b % n == 0) {
				break;
			}
			n--;
		}
		return n;
	}

	/*
	 * Euclid algorithm approach using modulo operation
	 * gcd(10,15)
	 * 
	 */
	public static int gcdeuclid(int a, int b) {

		while (a != b) {

			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}

		}
		return a;
	}

	/*
	 * In x%y if x is < y then the result will always be x.
	 * gcd(10,15)
	 * 	gcd(15,10)
	 * 		gcd(10,5)
	 * 			gcd(5,0)
	 */
	public static int gcdoptim(int a, int b) {

		if (b == 0)
			return a;

		return gcdoptim(b, a % b);

	}
}
