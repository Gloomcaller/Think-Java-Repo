package chapter8exercises;

public class Exercise82 {

	public static int oddSum(int n) {
		if (n % 2 == 0)
			n--;

		return (n == 1) ? 1 : n + oddSum(n - 2);
		/*
		 * I't kinda weird that there isn't a single mention of the ternary operator so
		 * far in the book.
		 */
	}

	public static void main(String[] args) {
		int n = 50;
		System.out.println("The sum of odd numbers up to " + n + " is: " + oddSum(n));
	}
}
