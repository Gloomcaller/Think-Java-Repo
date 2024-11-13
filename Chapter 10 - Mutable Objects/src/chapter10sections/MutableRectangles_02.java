package chapter10sections;

import java.awt.Point;
import java.awt.Rectangle;

public class MutableRectangles_02 {

	public static void main(String[] args) {
		Rectangle box = new Rectangle(0, 0, 100, 200);
		System.out.println("Initial Rectangle : " + box);

		Point center = findCenter(box);
		System.out.println("Center of Rectangle : (" + center.x + ", " + center.y + ")");

		box.x += 50;
		box.y += 100;
		System.out.println("Rectangle after direct modification : " + box);

		moveRect(box, 50, 100);
		System.out.println("Rectangle after moveRect : " + box);

		Rectangle box1 = new Rectangle(0, 0, 100, 200);
		Rectangle box2 = box1;

		box1.grow(50, 50);

		System.out.println("box1 after grow by 50,50 : " + box1);
		System.out.println("box2 after box1 grow : " + box2);
	}

	public static Point findCenter(Rectangle box) {
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2;
		return new Point(x, y);
	}

	public static void moveRect(Rectangle box, int dx, int dy) {
		box.x += dx;
		box.y += dy;
	}
}
