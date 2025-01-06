package chapter11exercises;

public class Exercise114 {

	public static class Rational {
		int numerator;
		int denominator;

		public Rational() {
			this.numerator = 1;
			this.denominator = 1;
		}

		public Rational(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
		}

		public void printRational() {
			System.out.println(this.numerator + "/" + this.denominator);
		}

		@Override
		public String toString() {
			return String.format("%d/%d", numerator, denominator);
		}

		public void negate() {
			this.numerator = -this.numerator;
		}

		public void invert() {
			int temp = this.numerator;
			this.numerator = this.denominator;
			this.denominator = temp;
		}

		public double toDouble() {
			return (double) this.numerator / this.denominator;
		}

		public Rational reduce() {
			int gcd = gcd(this.numerator, this.denominator);
			return new Rational(this.numerator / gcd, this.denominator / gcd);
		}

		private int gcd(int a, int b) {
			while (b != 0) {
				int temp = b;
				b = a % b;
				a = temp;
			}
			return a;
		}

		public Rational add(Rational rat) {
			int newNumerator = this.numerator * rat.denominator + rat.numerator * this.denominator;
			int newDenominator = this.denominator * rat.denominator;
			return new Rational(newNumerator, newDenominator).reduce();
		}
	}

	public static void main(String[] args) {
		Rational rat1 = new Rational(5, 6);
		rat1.printRational();

		rat1.negate();
		rat1.printRational();

		rat1.invert();
		rat1.printRational();

		double rat1D = rat1.toDouble();
		System.out.println("As double: " + rat1D);

		Rational rat2 = new Rational(8, 12);
		Rational reducedRat = rat2.reduce();
		System.out.println("Original: " + rat2);
		System.out.println("Reduced: " + reducedRat);

		Rational sum = rat1.add(rat2);
		System.out.println("Sum: " + sum);
	}
}
