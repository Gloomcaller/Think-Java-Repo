package chapter9sections;

public class DesignGeneralization_03 {

	public static void main(String[] args) {

		int num = 5;
		System.out.println("Factorial of " + num + " : " + factorial(num));

		System.out.println("Sum of 1 to 5 : " + sumUpTo(5));
		System.out.println("Sum of 1 to 10 : " + sumUpTo(10));

		System.out.println("Sum of odd numbers up to 9 : " + sumOddUpTo(9));
	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static int sumUpTo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static int sumOddUpTo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i += 2) {
			sum += i;
		}
		return sum;
	}
}
