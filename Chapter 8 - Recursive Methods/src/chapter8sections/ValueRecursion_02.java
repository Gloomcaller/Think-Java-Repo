package chapter8sections;

public class ValueRecursion_02 {
	public static int loot(int depth) {
		if (depth == 0) {
			return 10; // Base loot at level 0
		}
		return depth * 10 + loot(depth - 1);
	}

	public static int calculateHealth(int encounters) {
		if (encounters == 0) {
			return 100; // Base health
		}
		return calculateHealth(encounters - 1) - 10; // Losing 10 health per encounter
	}

	public static int experience(int battles) {
		if (battles == 0) {
			return 0;
		}
		return battles * 50 + experience(battles - 1); // 50 XP per battle
	}

	public static int dungeonDepth(int rooms) {
		if (rooms == 0) {
			return 0;
		}
		return 1 + dungeonDepth(rooms - 1); // Each room adds 1 to the depth
	}

	public static int magicalItems(int room) {
		if (room <= 0) {
			return 0;
		}
		if (room % 2 != 0) {
			return 1 + magicalItems(room - 1);
		}
		return magicalItems(room - 1); // No item in even-numbered rooms
	}

	public static void main(String[] args) {
		int depth = 5;
		int encounters = 3;
		int battles = 4;
		int rooms = 7;

		System.out.println("Dungeon Explorer Report :");
		System.out.println("Total loot collected : " + loot(depth));
		System.out.println("Health after " + encounters + " encounters : " + calculateHealth(encounters));
		System.out.println("Experience after " + battles + " battles : " + experience(battles));
		System.out.println("Depth reached by exploring " + rooms + " rooms : " + dungeonDepth(rooms));
		System.out.println("Magical items found : " + magicalItems(rooms));

		// While I don't find this book boring, I do need to have fun from time to time
		// :D
	}

}
