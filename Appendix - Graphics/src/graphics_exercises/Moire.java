package graphics_exercises;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Moire extends Canvas {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Moire Patterns");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Canvas canvas = new Moire();
		canvas.setSize(400, 400);
		canvas.setBackground(Color.WHITE);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		drawConcentricCircles(g);
		radial(g);
	}

	private void drawConcentricCircles(Graphics g) {
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		int radius = 10;
		boolean toggleColor = true;

		while (radius < Math.min(getWidth(), getHeight()) / 2) {
			g.setColor(toggleColor ? Color.RED : Color.BLUE);
			g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
			radius += 10;
			toggleColor = !toggleColor;
		}
	}

	private void radial(Graphics g) {
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		int radius = Math.min(getWidth(), getHeight()) / 2;
		g.setColor(Color.BLACK);

		for (int angle = 0; angle < 360; angle += 5) {
			double radians = Math.toRadians(angle);
			int x = centerX + (int) (radius * Math.cos(radians));
			int y = centerY + (int) (radius * Math.sin(radians));
			g.drawLine(centerX, centerY, x, y);
		}
	}
}
