package com.vinay.mathematics;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primeFactNaive(60);
		primeFactEff(450);
		 primeFactMore(621);

	}

	/*
	 * Find if the input number is a prime from 2 to (n-1), then check if the
	 * input number is divisible by prime factor and its factor
	 */

	public static boolean isPrimeNaive(int n) {
		if (n == 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void primeFactNaive(int n) {
		for (int i = 2; i < n; i++) {
			int x = i;
			if (isPrimeNaive(i)) {
				while (n % x == 0) {
					System.out.print(i + "*");
					x = x * i;
				}
			}
		}
	}

	/*
	 * For the input value, loop from 2 to sqrt(n), check if the number is
	 * divisible by prime number
	 */

	public static void primeFactEff(int n) {
		if(n <1) return ;
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + "*");
				n = n / i;

			}
		}

		if (n > 1)
			System.out.print(n + "*");
	}

	/*
	 * For the input value, loop from 2 to sqrt(n), check if the number is
	 * divisible by prime number
	 * Here the number is checked if divisible by 2 and 3 first
	 */
	public static void primeFactMore(int n) {
		if(n<1) return;
		while (n % 2 == 0) {
			System.out.print("2*");
			n = n / 2;
		}

		while (n % 3 == 0) {
			System.out.print("3*");
			n = n / 3;
		}

		for (int i = 5; i * i <= n; i = i + 6) {

			while (n % i == 0) {
				System.out.print(i + "*");
				n = n / i;
			}

			while (n % (i + 2) == 0) {
				System.out.print(i + 2 + "*");
				n = n / (i + 2);
			}

		}

		if (n > 3)
			System.out.print(n + "*");
	}

}
