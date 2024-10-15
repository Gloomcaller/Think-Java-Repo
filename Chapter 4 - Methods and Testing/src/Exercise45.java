
public class Exercise45 {

	public static void zoop(String fred, int bob) {
		System.out.println(fred); // 2 prints "just for", 8 it prints "breakfast"
		if (bob == 5) { // 3 and it is the first time
			ping("not ");
		} else {
			System.out.println("!"); // 9 it just prints an exclamation mark and the code is done
		}
	}

	public static void clink(int fork) {
		System.out.print("It's "); // 6 this prints
		zoop("breakfast ", fork); // 7 and this is the second zoop
	}

	public static void ping(String strangStrung) {
		System.out.println("any " + strangStrung + "more "); // 4 prints this whole thing
	}

	public static void main(String[] args) {
		int bizz = 5;
		int buzz = 2;
		zoop("just for", bizz); // 1
		clink(2 * buzz); // 5 now click is invoked with value of 4
	}

}
