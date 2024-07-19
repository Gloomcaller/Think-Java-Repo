public class MemoryDiagrams_02 {

	public static void main(String[] args) {
		// Initializing variables
		int a = 5;
		System.out.println("Initial value of a: " + a); // Output: 5

		int b = a; // a and b are now equal
		System.out.println("Value of b (after b = a): " + b); // Output: 5

		a = 3; // a and b are no longer equal
		System.out.println("Value of a after a = 3: " + a); // Output: 3
		System.out.println("Value of b (should still be 5): " + b); // Output: 5

		// More variable assignments
		int c = b + a; // c is the sum of b and a
		System.out.println("Value of c (b + a): " + c); // Output: 8 (5 + 3)

		b = c; // b is now equal to c
		System.out.println("Value of b (after b = c): " + b); // Output: 8

		c = 10; // changing the value of c
		System.out.println("Value of c after c = 10: " + c); // Output: 10

		// Using variables in expressions
		int d = a * b; // d is the product of a and b
		System.out.println("Value of d (a * b): " + d); // Output: 24 (3 * 8)

		int e = d - c; // e is the difference between d and c
		System.out.println("Value of e (d - c): " + e); // Output: 14 (24 - 10)

		// Combining all variables in a complex expression
		int f = a + b + c + d + e;
		System.out.println("Value of f (a + b + c + d + e): " + f); // Output: 58 (3 + 8 + 10 + 24 + 14)
	}
}
