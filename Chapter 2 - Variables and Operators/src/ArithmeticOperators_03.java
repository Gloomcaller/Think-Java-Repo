
public class ArithmeticOperators_03 {

	public static void main(String[] args) {
		// Convert time of day to minutes
		int hour = 11;
		int minute = 59;

		// Number of minutes since midnight
		int minutesSinceMidnight = hour * 60 + minute;
		System.out.print("Number of minutes since midnight: ");
		System.out.println(minutesSinceMidnight);

		// Fraction of the hour that has passed (integer division)
		double fractionOfHourInt = minute / 60; // Integer division
		System.out.print("Fraction of the hour that has passed (integer division): ");
		System.out.println(fractionOfHourInt);

		// Correct fraction of the hour that has passed (floating-point division)
		double minuteAsDouble = 59.0;
		double fractionOfHourDouble = minuteAsDouble / 60.0; // Floating-point division
		System.out.print("Fraction of the hour that has passed (floating-point division): ");
		System.out.println(fractionOfHourDouble);

		// Additional calculations
		// Calculating the number of seconds since midnight
		int secondsSinceMidnight = minutesSinceMidnight * 60;
		System.out.print("Number of seconds since midnight: ");
		System.out.println(secondsSinceMidnight);

		// Demonstrating the use of pi in calculations
		double pi = 3.14159;
		double radius = 5.0;
		double circumference = 2 * pi * radius;
		double area = pi * radius * radius;

		System.out.print("Circumference of a circle with radius 5.0: ");
		System.out.println(circumference);

		System.out.print("Area of a circle with radius 5.0: ");
		System.out.println(area);

		// Showing different types of division
		int intDivisionResult = 10 / 3; // Integer division
		double doubleDivisionResult = 10.0 / 3; // Floating-point division

		System.out.print("Result of integer division (10 / 3): ");
		System.out.println(intDivisionResult);

		System.out.print("Result of floating-point division (10.0 / 3): ");
		System.out.println(doubleDivisionResult);

		// Combining variables in calculations
		int a = 8;
		int b = 3;
		int sum = a + b;
		int difference = a - b;
		int product = a * b;
		double quotient = (double) a / b; // Cast to double for floating-point division

		System.out.print("Sum of a and b: ");
		System.out.println(sum);

		System.out.print("Difference between a and b: ");
		System.out.println(difference);

		System.out.print("Product of a and b: ");
		System.out.println(product);

		System.out.print("Quotient of a divided by b: ");
		System.out.println(quotient);

	}

}
