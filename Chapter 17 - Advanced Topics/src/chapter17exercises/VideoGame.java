package chapter17exercises;

import java.awt.*;
import javax.swing.*;

public class VideoGame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Video Game");
		Drawing drawing = new Drawing();

		Polygon triangle = new Polygon(new int[] { 0, 50, 25 }, new int[] { 0, 0, 50 }, 3);
		Polygon hexagon = new Polygon(new int[] { 0, 40, 80, 80, 40, 0 }, new int[] { 40, 0, 40, 80, 120, 80 }, 6);

		MovingPolygon movingPolygon = new MovingPolygon(triangle, Color.RED, 800, 600);
		movingPolygon.setVelocity(3, 2);

		BlinkingPolygon blinkingPolygon = new BlinkingPolygon(hexagon, Color.GREEN);
		Sprite sprite = new Sprite("face-smile.png", 100, 100);

		drawing.addActor(movingPolygon);
		drawing.addActor(blinkingPolygon);
		drawing.addActor(sprite);

		frame.addKeyListener(sprite);
		frame.add(drawing);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		Timer timer = new Timer(33, e -> drawing.step());
		timer.start();
	}
}