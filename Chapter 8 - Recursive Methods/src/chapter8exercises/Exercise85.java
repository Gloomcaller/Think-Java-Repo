package chapter8exercises;

public class Exercise85 {

	public static double power(double x, int n) {
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			double halfPower = power(x, n / 2);
			return halfPower * halfPower;
		} else {
			return x * power(x, n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(power(2, 10));
		System.out.println(power(3, 5));
		System.out.println(power(5, 0));
	}
}
