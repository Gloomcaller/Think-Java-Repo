package chapter9sections;

public class PrimitivesAndObjects {

	public static void main(String[] args) {

		int primitiveInt = 5;
		Integer objectInt = Integer.valueOf(5);

		System.out.println("Primitive int: " + primitiveInt);
		System.out.println("Integer object: " + objectInt);

		Integer nullableInt = null;
		System.out.println("Nullable Integer: " + nullableInt);

		String str1 = "Hello";
		String str2 = str1;
		str1 = str1 + " World";
		System.out.println("Original string changed to: " + str1);
		System.out.println("str2 remains: " + str2);
	}
}
