package chapter5exercises;

import java.util.Scanner;

public class Exercise53 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number for N (needs to be greater than 2) : ");
		double numberN = in.nextDouble();
		System.out.println("Enter the number for A : ");
		double numberA = in.nextDouble();
		System.out.println("Enter the number for B : ");
		double numberB = in.nextDouble();
		System.out.println("Enter the number for C : ");
		double numberC = in.nextDouble();

		double abcResoult = Math.pow(numberA, numberC) + Math.pow(numberA, numberN);
		if (numberN > 2 && (Math.pow(numberC, numberN) == abcResoult)) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println("No, that doesn’t work.");
		}
	}

}
