package chapter5exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise52 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		int numberToGuess = random.nextInt(100) + 1;
		int attempts = 0;
		int maxAttempts = 3;
		boolean guessedCorrectly = false;

		System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

		while (attempts < maxAttempts && !guessedCorrectly) {
			System.out.print("Type a number: ");
			int userGuess = in.nextInt();
			attempts++;

			if (userGuess == numberToGuess) {
				guessedCorrectly = true;
				System.out.println("Congrat's! You guessed the number.");
			} else if (userGuess < numberToGuess) {
				System.out.println("Your guess is too low.");
			} else {
				System.out.println("Your guess is too high.");
			}

			if (!guessedCorrectly && attempts < maxAttempts) {
				System.out.println("You have " + (maxAttempts - attempts) + " attempt/s left.");
			}
		}

		if (!guessedCorrectly) {
			System.out.println(
					"Sorry, you've used all your attempts. The number I was thinking of was: " + numberToGuess);
		}

	}

}
