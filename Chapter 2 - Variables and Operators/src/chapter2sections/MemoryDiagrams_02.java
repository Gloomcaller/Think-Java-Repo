package chapter2sections;
public class MemoryDiagrams_02 {

	public static void main(String[] args) {

		int a = 5;
		System.out.println("Initial value of a: " + a);

		int b = a;
		System.out.println("Value of b (after b = a): " + b);

		a = 3;
		System.out.println("Value of a after a = 3: " + a);
		System.out.println("Value of b (should still be 5): " + b);

		int c = b + a;
		System.out.println("Value of c (b + a): " + c);

		System.out.println("Value of b (after b = c): " + b);

		c = 10;
		System.out.println("Value of c after c = 10: " + c);

		int d = a * b;
		System.out.println("Value of d (a * b): " + d);

		int e = d - c;
		System.out.println("Value of e (d - c): " + e);

		int f = a + b + c + d + e;
		System.out.println("Value of f (a + b + c + d + e): " + f);
	}
}
