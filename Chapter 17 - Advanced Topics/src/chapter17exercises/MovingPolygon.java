package chapter17exercises;

import java.awt.*;

public class MovingPolygon extends PolygonActor {
	private int boundsWidth, boundsHeight;

	public MovingPolygon(Polygon shape, Color color, int boundsWidth, int boundsHeight) {
		super(shape, color);
		this.boundsWidth = boundsWidth;
		this.boundsHeight = boundsHeight;
	}

	@Override
	public void step() {
		super.step();
		Rectangle bounds = shape.getBounds();

		if (bounds.x < 0 || bounds.x + bounds.width > boundsWidth) {
			dx = -dx;
		}
		if (bounds.y < 0 || bounds.y + bounds.height > boundsHeight) {
			dy = -dy;
		}
	}
}