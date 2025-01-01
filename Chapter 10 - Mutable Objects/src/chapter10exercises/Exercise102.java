package chapter10exercises;

import java.awt.Point;
import java.awt.Rectangle;

public class Exercise102 {

	public static Point findCenter(Rectangle rect) {
		int centerX = rect.x + rect.width / 2;
		int centerY = rect.y + rect.height / 2;

		System.out.println("Stack before findCenter returns:");
		System.out.println("rect = " + rect);
		System.out.println("centerX = " + centerX);
		System.out.println("centerY = " + centerY);

		return new Point(centerX, centerY);
	}

	public static double distance(Point p1, Point p2) {
		int dx = p2.x - p1.x;
		int dy = p2.y - p1.y;
		double dist = Math.sqrt(dx * dx + dy * dy);

		System.out.println("Stack before distance returns:");
		System.out.println("p1 = (" + p1.x + ", " + p1.y + ")");
		System.out.println("p2 = (" + p2.x + ", " + p2.y + ")");
		System.out.println("dx = " + dx);
		System.out.println("dy = " + dy);
		System.out.println("dist = " + dist);

		return dist;
	}

	public static void main(String[] args) {
		Point blank = new Point(5, 8);
		Rectangle rect = new Rectangle(0, 2, 4, 4);

		Point center = findCenter(rect);
		double dist = distance(center, blank);

		System.out.println("\nFinal Outputs:");
		System.out.println("Center of rect = (" + center.x + ", " + center.y + ")");
		System.out.println("Distance = " + dist);
	}
}
