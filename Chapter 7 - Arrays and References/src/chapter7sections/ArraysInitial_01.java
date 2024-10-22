package chapter7sections;

public class ArraysInitial_01 {

	public static void printArray(int[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		int[] counts = new int[4];
		double[] values = new double[5];

		System.out.println("The zeroth element is " + counts[0]);
		counts[0] = 7;
		counts[1] = counts[0] * 2;
		counts[2]++;
		counts[3] -= 60;

		int i = 0;
		while (i < counts.length) {
			System.out.println("counts[" + i + "] = " + counts[i]);
			i++;
		}

		for (int j = 0; j < counts.length; j++) {
			System.out.println("counts[" + j + "] = " + counts[j]);
		}

		int[] a = { 1, 2, 3, 4 };
		System.out.println("Array a: ");
		printArray(a);

		System.out.println("Array a using default toString: " + a);
	}

}
