package chapter4sections;

public class Multadd_06 {

	public static double expSum(double eks) {
		double first = multadd(eks, Math.exp(-eks), 0);
		double second = multadd(Math.sqrt(1.0 - Math.exp(-eks)), 1.0, 0.0);
		return multadd(1.0, first, second);
		// I know I didn't need to use multadd for first and second, but i wanted to :D
	}

	public static double multadd(double first, double second, double third) {
		return (first * second) + third;
	}

	public static void main(String[] args) {
		double testMultadd1 = multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
		System.out.println(testMultadd1 + "	Test 1");

		double testMultadd2 = multadd(Math.log(10), 2.0, Math.log(10));
		System.out.println(testMultadd2 + "	Test 2");

		double testexpSum1 = expSum(2.0);
		System.out.println(testexpSum1 + "	Test 3");
	}

}
