package chapter17sections;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		DrawablePolygon p1 = new RegularPolygon(3, 50, Color.GREEN);
		DrawablePolygon p2 = new RegularPolygon(6, 50, Color.ORANGE);
		DrawablePolygon p3 = new RegularPolygon(360, 50, Color.BLUE);

		p1.translate(100, 80);
		p2.translate(250, 120);
		p3.translate(400, 160);

		Drawing drawing = new Drawing(500, 250);
		drawing.add(p1);
		drawing.add(p2);
		drawing.add(p3);

		JFrame frame = new JFrame("Drawing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(drawing);
		frame.pack();
		frame.setVisible(true);
	}

}