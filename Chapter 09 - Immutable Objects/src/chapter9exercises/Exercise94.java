package chapter9exercises;

public class Exercise94 {

	public static double myexp(double x, int n) {
		double sum = 1.0;
		double term = 1.0;

		for (int i = 1; i <= n; i++) {
			term *= x / i;
			sum += term;
		}
		return sum;
	}

	public static void check(double x, int n) {
		System.out.println(x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
	}

	public static void main(String[] args) {
		check(0.1, 10);
		check(1.0, 10);
		check(10.0, 10);
		check(100.0, 10);

		check(-0.1, 10);
		check(-1.0, 10);
		check(-10.0, 10);
		check(-100.0, 10);
	}
}
