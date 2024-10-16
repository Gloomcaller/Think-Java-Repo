package chapert5sections;
import java.util.Scanner;

// Demonstrates input validation using if statements and adds extra features.

public class ValidatingExample_04 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double x = 0;
		boolean isValid = false;

		// Loop until valid input is provided
		while (!isValid) {
			System.out.print("Enter a positive number: ");

			// Check if input is a valid number
			if (!in.hasNextDouble()) {
				String word = in.next();
				System.err.println(word + " is not a valid number.");
			} else {
				x = in.nextDouble();

				// Check if number is positive
				if (x <= 0) {
					System.out.println("The number must be positive.");
				} else {
					isValid = true; // Input is valid
				}
			}
		}

		// Perform multiple operations once valid input is received
		double logValue = Math.log(x);
		System.out.println("The log of " + x + " is " + logValue);

		double sqrtValue = Math.sqrt(x);
		System.out.println("The square root of " + x + " is " + sqrtValue);

		double squareValue = Math.pow(x, 2);
		System.out.println("The square of " + x + " is " + squareValue);

		// Using conditional logic to give specific feedback
		if (x > 1000) {
			System.out.println("That's a large number!");
		} else if (x > 100) {
			System.out.println("That's a moderate number.");
		} else {
			System.out.println("That's a small number.");
		}
	}
}
