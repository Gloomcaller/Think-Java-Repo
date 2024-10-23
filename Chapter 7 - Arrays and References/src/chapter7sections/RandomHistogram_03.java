package chapter7sections;

import java.util.Random;

public class RandomHistogram_03 {

	public static int[] randomArray(int size) {
		Random random = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		System.out.print("Array : {");
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println("}");
	}

	public static int inRange(int[] arr, int low, int high) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= low && arr[i] < high) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] scores = randomArray(30);
		printArray(scores);

		int scoreA = inRange(scores, 90, 100);
		int scoreB = inRange(scores, 80, 90);
		int scoreC = inRange(scores, 70, 80);
		int scoreD = inRange(scores, 60, 70);
		int scoreF = inRange(scores, 0, 60);

		System.out.println("Grade Distribution : ");
		System.out.println("A : " + scoreA);
		System.out.println("B : " + scoreB);
		System.out.println("C : " + scoreC);
		System.out.println("D : " + scoreD);
		System.out.println("F : " + scoreF);

		int[] counts = new int[100];
		for (int i = 0; i < scores.length; i++) {
			counts[scores[i]]++;
		}

		System.out.println("\nDetailed Histogram : ");
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				System.out.println(i + " : " + counts[i]);
			}
		}

	}
}
