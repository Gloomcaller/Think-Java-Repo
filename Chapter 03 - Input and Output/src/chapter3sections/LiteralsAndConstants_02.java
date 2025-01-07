package chapter3sections;

import java.util.Scanner;

public class LiteralsAndConstants_02 {

	public static void main(String[] args) {

		int inch;
		double cm;
		Scanner in = new Scanner(System.in);

		System.out.println("How many inches ?");
		inch = in.nextInt();

		final double CM_PER_INCH = 2.54;

		cm = inch * CM_PER_INCH;
		System.out.print(inch + " in = ");
		System.out.print(cm + " cm");
		
		in.close();
	}

}
