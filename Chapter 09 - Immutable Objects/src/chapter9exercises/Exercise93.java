package chapter9exercises;

import java.math.BigInteger;

public class Exercise93 {

	public static BigInteger pow(int x, int n) {
		BigInteger bigX = BigInteger.valueOf(x);

		if (n == 0) {
			return BigInteger.ONE;
		}

		BigInteger t = pow(x, n / 2);

		if (n % 2 == 0) {
			return t.multiply(t);
		} else {
			return t.multiply(t).multiply(bigX);
		}
	}

	public static void main(String[] args) {
		int x = 5;
		int n = 20;
		BigInteger result = pow(x, n);
		System.out.println(x + " to the power of " + n + " is : " + result);
	}
}
