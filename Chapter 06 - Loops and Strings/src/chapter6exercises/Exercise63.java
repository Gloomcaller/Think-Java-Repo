package chapter6exercises;

public class Exercise63 {

	public static double gauss(double x, int n) {
		double sum = 1.0;
		double term = 1.0;

		for (int i = 1; i < n; i++) {
			term *= -x * x / i;
			sum += term;
		}
		return sum;
	}

	public static void main(String[] args) {
		double x = 1.0;
		int n = 5;

		double result = gauss(x, n);
		System.out.println("The approximation of exp(-x^2) using " + n + " terms is : " + result);
	}
}
