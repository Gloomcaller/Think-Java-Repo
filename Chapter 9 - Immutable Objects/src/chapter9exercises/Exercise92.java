package chapter9exercises;

import java.math.BigInteger;

public class Exercise92 {

	public static int factorialInt(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static BigInteger factorialBig(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.printf("%-10s %-20s %-20s%n", "n", "factorial (int)", "factorial (BigInteger)");
		for (int i = 0; i <= 30; i++) {
			int factorialInt = (i <= 15) ? factorialInt(i) : -1;

			BigInteger factorialBig = factorialBig(i);

			System.out.printf("%-10d %-20s %-20s%n", i, (factorialInt >= 0) ? factorialInt : "Overflow", factorialBig);
		}
	}
}
