package graphics_chapters;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Drawing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Drawing drawing = new Drawing();
		drawing.setSize(400, 400);
		frame.add(drawing);
		frame.pack();
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, 100, 200, 200);
	}
}
