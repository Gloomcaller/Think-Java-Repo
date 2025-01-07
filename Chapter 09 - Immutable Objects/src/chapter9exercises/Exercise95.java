package chapter9exercises;

import java.util.Arrays;

public class Exercise95 {

	public static double[] powArray(double[] arr, int pow) {
		double[] tempArr = new double[arr.length];

		for (int i = 0; i < arr.length; i++) {
			tempArr[i] = Math.pow(arr[i], pow);
		}
		return tempArr;
	}

	public static int[] histMaker(int[] arr, int count) {
		int[] histogram = new int[count];

		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];

			if (value >= 0 && value < count) {
				histogram[value]++;
			}
		}
		return histogram;
	}

	public static void main(String[] args) {
		double[] arrD1 = { 5.6, 8.4, 9.4, 3.9, 5.3, 5.6, 8.4, 1.2, 5.4, 6.5 };
		double[] arrD2 = powArray(arrD1, 3);

		int[] arrI1 = { 1, 1, 2, 3, 4, 3, 5, 1, 5, 3, 5, 4, 6, 1, 3, 1, 2 };
		int[] arrI1Hiso = histMaker(arrI1, 10);

		System.out.println(Arrays.toString(arrD2));
		System.out.println(Arrays.toString(arrI1Hiso));

	}

}
