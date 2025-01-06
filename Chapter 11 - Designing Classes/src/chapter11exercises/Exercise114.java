package chapter11exercises;

public class Exercise114 {

	public static class Rational {
		int numerator;
		int denominator;

		public Rational() {
			this.numerator = 0;
			this.denominator = 1;
		}

		public Rational(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
		}

		public static void printRational(Rational rat) {
			System.out.println("Numerator: " + rat.numerator + " Demonimator: " + rat.denominator);
		}

		public static String toString(Rational rat) {
			return String.format("%02d:%02d", rat.numerator, rat.denominator);
		}

		public void negate() {
			this.numerator = -this.numerator;
		}

		public void invert() {
			int tempV = this.numerator;
			this.numerator = this.denominator;
			this.denominator = tempV;
		}

		public static double toDouble(Rational rat) {
			return (double) rat.numerator / rat.denominator;
		}

		public void reduce() {

		}
	}

	public static void main(String[] args) {
		Rational rat1 = new Rational(5, 6);
		Rational.printRational(rat1);

		rat1.negate();
		Rational.printRational(rat1);

		rat1.invert();
		Rational.printRational(rat1);

		double rat1D = Rational.toDouble(rat1);
		System.out.println(rat1D);

	}

}
