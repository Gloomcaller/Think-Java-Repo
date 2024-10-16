package chapter3sections;
import java.util.Scanner;

public class Converter_03 {

	public static void main(String[] args) {

		final double CM_PER_INCH = 2.54;
		final int IN_PER_FOOT = 12;

		Scanner in = new Scanner(System.in);

		System.out.print("Exactly how many cm? ");
		double cm = in.nextDouble();

		int totalInches = (int) (cm / CM_PER_INCH);

		int feet = totalInches / IN_PER_FOOT;
		int inches = totalInches % IN_PER_FOOT;

		System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, inches);

		double meters = cm / 100;
		double kilometers = meters / 1000;

		System.out.printf("%.2f cm = %.2f meters\n", cm, meters);
		System.out.printf("%.2f cm = %.5f kilometers\n", cm, kilometers);

		System.out.print("Enter inches to convert to cm: ");
		double inputInches = in.nextDouble();
		double convertedCm = inputInches * CM_PER_INCH;
		System.out.printf("%.2f inches = %.2f cm\n", inputInches, convertedCm);

		in.close();
	}
}
