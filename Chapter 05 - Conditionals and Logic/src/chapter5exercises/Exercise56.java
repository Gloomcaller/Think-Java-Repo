package chapter5exercises;

import java.util.Scanner;

public class Exercise56 {

	public static double validNumInsert(Scanner in) {
		double temp;
		while (true) {
			if (in.hasNextDouble()) {
				temp = in.nextDouble();
				if (temp > 0) {
					break;
				} else {
					System.err.println("Number must be greater than 0. Try again: ");
				}
			} else {
				System.err.println("That's not a valid number. Try again: ");
				in.next();
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number for A : ");
		double numA = validNumInsert(in);
		System.out.println("Enter the number for B : ");
		double numB = validNumInsert(in);
		System.out.println("Enter the number for C : ");
		double numC = validNumInsert(in);

		double discriminant = Math.pow(numB, 2) - 4 * numA * numC;

		if (discriminant < 0) {
			System.out.println("No real solutions (the discriminant is negative).");
		} else {
			double sqrtDiscriminant = Math.sqrt(discriminant);
			double x1plus = (-numB + sqrtDiscriminant) / (2 * numA);
			double x2minus = (-numB - sqrtDiscriminant) / (2 * numA);

			System.out.println("X1 = " + x1plus + " X2 = " + x2minus);
		}
	}
}
