package chapter3exercises;

import java.util.Scanner;
import java.util.Random;

public class Exercise34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		int numberToGuess = random.nextInt(100) + 1;

		System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		int userGuess = in.nextInt();

		System.out.println("Your guess is: " + userGuess);
		System.out.println("The number I was thinking of is: " + numberToGuess);

		int difference = Math.abs(numberToGuess - userGuess);
		System.out.println("You were off by: " + difference);
		in.close();
	}
}
