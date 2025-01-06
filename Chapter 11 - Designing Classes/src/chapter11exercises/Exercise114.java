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
			System.out.println(rat.numerator + "/" + rat.denominator);
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

		public Rational reduce() {
			int gcd = gcd(this.numerator, this.denominator);
			int reducedNumerator = this.numerator / gcd;
			int reducedDenominator = this.denominator / gcd;
			return new Rational(reducedNumerator, reducedDenominator);
		}

		private int gcd(int a, int b) {
			while (b != 0) {
				int temp = b;
				b = a % b;
				a = temp;
			}
			return a;
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

		Rational rat2 = new Rational(8, 12);
		Rational reducedRat = rat2.reduce();
		System.out.println("Original: " + rat2.numerator + "/" + rat2.denominator);
		System.out.println("Reduced: " + reducedRat.numerator + "/" + reducedRat.denominator);
	}

}
