package chapter9sections;

import java.math.BigInteger;

public class WrapperValidation_02 {

	public static void main(String[] args) {

		Integer intWrapper = Integer.valueOf(10);
		Double doubleWrapper = Double.valueOf(20.5);
		System.out.println("Integer Wrapper : " + intWrapper);
		System.out.println("Double Wrapper : " + doubleWrapper);

		if (args.length > 0) {
			System.out.println("First cmd-line argument : " + args[0]);
		} else {
			System.out.println("No cmd-line arguments provided.");
		}

		if (args.length < 2) {
			System.out.println("Please provide two numbers as arguments.");
		} else {
			try {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				System.out.println("Arguments are valid numbers : " + num1 + " and " + num2);
			} catch (NumberFormatException e) {
				System.out.println("Invalid number format in arguments.");
			}
		}

		BigInteger bigNum1 = new BigInteger("123456789123456789123456789");
		BigInteger bigNum2 = new BigInteger("987654321987654321987654321");
		BigInteger result = bigNum1.add(bigNum2);
		System.out.println("BigInteger addition result : " + result);
	}
}
