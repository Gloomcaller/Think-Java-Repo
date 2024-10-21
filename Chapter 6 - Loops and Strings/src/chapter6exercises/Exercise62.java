package chapter6exercises;

public class Exercise62 {

	public static void main(String[] args) {
		int a = 9;
		double x0 = a / 2;
		double x1;
		int iterations = 0;

		for (int i = 0; i < 100; i++) {
			x1 = (x0 + a / x0) / 2;
			iterations++;
			if (Math.abs(x1 - x0) < 0.0001) {
				System.out.println(
						"The square root of " + a + " is " + x1 + ", and it took " + iterations + " iterations.");
				break;
			}
			x0 = x1;
		}

	}

}
