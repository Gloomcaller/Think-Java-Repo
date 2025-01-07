package chapter5exercises;

import java.util.Scanner;

public class Exercise57 {

	public static double validNumInsert(Scanner in) {
		double temp;
		while (true) {
			if (in.hasNextDouble()) {
				temp = in.nextDouble();
				if (temp > 0) {
					break;
				} else {
					System.err.println("Stick must me longer than 0. Try again: ");
				}
			} else {
				System.err.println("That's not a valid length. Try again: ");
				in.next();
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the length for stick number 1 : ");
		double stick1 = validNumInsert(in);
		System.out.println("Enter the length for stick number 2 : ");
		double stick2 = validNumInsert(in);
		System.out.println("Enter the length for stick number 3 : ");
		double stick3 = validNumInsert(in);

		if (stick1 > stick2 + stick3) {
			System.out.println("Stick number 1 is too big !");
		} else if (stick2 > stick1 + stick3) {
			System.out.println("Stick number 2 is too big !");
		} else if (stick3 > stick1 + stick2) {
			System.out.println("Stick number 3 is too big !");
		} else {
			System.out.print("You can make a stick triange !");
		}

	}

}
