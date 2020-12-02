package com.vinay.mathematics;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = isPrimeNaive(3);
		System.out.println("Naive " + a);

		boolean b = isPrimeEff(37);
		System.out.println("Eff " + b);

		boolean c = isPrimeMoreEff(1031);
		System.out.println("MoreEff " + c);

	}
	
	/*
	 * A number is said to be prime, if it is divisible by itself or 1
	 * To check for prime n, from 2 to (n-1)
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

	/*
	 * To check for prime n, from 2 to sqrt(n).Even if there is a divisor greater than sqrt(n), 
	 * it will have pairs and will be less than sqrt(n)
	 * N will always have pair x,y x*y = n if x<y x*x<n
	 */
	public static boolean isPrimeEff(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	/*By checking for n%2 and n%3, we can save many iterations
	 * we need to write a condition for n=2 and n=3 to be true before 
	 * we perform mod operations, in which case it returns false
	 * 
	 */

	public static boolean isPrimeMoreEff(int n) {
		if (n == 1)
			return false;

		if (n == 2 || n == 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}

}
