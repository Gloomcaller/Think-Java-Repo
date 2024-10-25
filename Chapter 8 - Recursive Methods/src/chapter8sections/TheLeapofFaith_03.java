package chapter8sections;

public class TheLeapofFaith_03 {

	public static boolean isSimple(int x) {
		return x > -10 && x < 10;
	}

	public static int magicPowerFactorial(int n) {
		if (n == 0) {
			System.out.println("Reached the core of magic for factorial!");
			return 1;
		}
		System.out.println("Summoning factorial magic for " + n);
		return n * magicPowerFactorial(n - 1);
	}

	public static int divineFibonacci(int n) {
		if (n == 1 || n == 2) {
			System.out.println("The Oracle reveals the base case for Fibonacci!");
			return 1;
		}
		System.out.println("The Oracle peers deeper into the Fibonacci sequence for " + n);
		return divineFibonacci(n - 1) + divineFibonacci(n - 2);
	}

	public static int mysteriousSum(int x) {
		if (isSimple(x)) {
			System.out.println("Reached a single magical number: " + x);
			return x;
		}
		int lastDigit = x % 10;
		int restOfNumber = x / 10;
		System.out.println("Combining magic of digits: " + lastDigit + " + sum of " + restOfNumber);
		return lastDigit + mysteriousSum(restOfNumber);
	}

	public static void main(String[] args) {
		System.out.println("Magic Oracle Factorial of 5: " + magicPowerFactorial(5));
		System.out.println("Magic Oracle Fibonacci of 6: " + divineFibonacci(6));
		System.out.println("Magic Oracle Sum of Digits for 345: " + mysteriousSum(345));
	}
}
