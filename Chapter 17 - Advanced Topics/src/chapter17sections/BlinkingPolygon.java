package chapter17sections;

import java.awt.Color;
import java.awt.Graphics;

public class BlinkingPolygon extends RegularPolygon {

	protected boolean visible;
	protected int count;

	public BlinkingPolygon(int nsides, int radius, Color color) {
		super(nsides, radius, color);
		visible = true;
		count = 0;
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
		if (count == 10) {
			visible = !visible;
			count = 0;
		}
	}

}