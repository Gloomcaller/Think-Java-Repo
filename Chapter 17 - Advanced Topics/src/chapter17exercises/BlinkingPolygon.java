package chapter17exercises;

import java.awt.*;

public class BlinkingPolygon extends PolygonActor {
	private boolean visible = true;
	private int count = 0;

	public BlinkingPolygon(Polygon shape, Color color) {
		super(shape, color);
	}

	@Override
	public void draw(Graphics g) {
		if (visible) {
			super.draw(g);
		}
	}

	@Override
	public void step() {
		count++;
		if (count >= 10) {
			visible = !visible;
			count = 0;
		}
	}
}