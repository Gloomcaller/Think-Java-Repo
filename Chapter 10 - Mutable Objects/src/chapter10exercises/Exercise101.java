package chapter10exercises;

import java.awt.Point;

public class Exercise101 {

	public static int riddle(int x, Point p) {
		x = x + 7;
		p.x = p.x + 5;
		p.y = p.y * 2;
		return x + p.x + p.y;
	}

	public static void main(String[] args) {
		int x = 5;
		Point blank = new Point(1, 2);

		System.out.println("Before calling riddle:");
		System.out.println("blank.x = " + blank.x);
		System.out.println("blank.y = " + blank.y);

		int result = riddle(x, blank);
		System.out.println("\nAfter calling riddle:");
		System.out.println("Result from riddle = " + result);
		System.out.println("x in main = " + x);
		System.out.println("blank.x = " + blank.x);
		System.out.println("blank.y = " + blank.y);
	}
}
