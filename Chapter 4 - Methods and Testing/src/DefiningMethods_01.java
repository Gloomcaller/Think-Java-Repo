public class DefiningMethods_01 {

	public static void newLine() {
		System.out.println();
	}

	public static void treeLine() {
		newLine();
		newLine();
		newLine();
	}
	
	public static void main(String[] args) {
		System.out.println("First line.");
		newLine();
		System.out.println("Second Line.");
		treeLine();
		System.out.println("Third Line.");
	}

}
