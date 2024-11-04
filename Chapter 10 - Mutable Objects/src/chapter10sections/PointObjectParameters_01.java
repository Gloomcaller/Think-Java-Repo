package chapter10sections;

import java.awt.Point;

public class PointObjectParameters_01 {

	public static void main(String[] args) {
		Point blank = new Point(3, 4);

		int x = blank.x;
		System.out.println("Coordinates of blank : " + blank.x + ", " + blank.y);

		int sum = blank.x * blank.x + blank.y * blank.y;
		System.out.println("Sum of squares of blank's coordinates : " + sum);

		printPoint(blank);

		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);
		double dist = distance(p1, p2);
		System.out.println("Distance between p1 and p2 : " + dist);
	}

	public static void printPoint(Point p) {
		System.out.println("Point coordinates : (" + p.x + ", " + p.y + ")");
	}

	public static double distance(Point p1, Point p2) {
		int dx = p2.x - p1.x;
		int dy = p2.y - p1.y;
		return Math.sqrt(dx * dx + dy * dy);
		
		//te
	}
}
