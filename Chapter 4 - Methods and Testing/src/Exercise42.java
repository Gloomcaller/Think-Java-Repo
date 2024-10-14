
public class Exercise42 {

	public static void zippo(String quince, int flag) {
		if (flag < 0) {
			System.out.println(quince + " zoop");
		} else {
			System.out.println("ik"); // 1
			baffle(quince);
			System.out.println("boo-wa-ha-ha");
		}
	}

	public static void baffle(String blimp) {
		System.out.println(blimp); // 2 is rattle from quince in zippo
		zippo("ping", -5);
	}

	public static void main(String[] args) {
		zippo("rattle", 13);
		/*
		 * output is (in order as written) : ik rattle ping zoop boo-wa-ha-ha
		 */
	}

}
