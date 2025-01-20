package chapter17exercises;

import java.awt.*;

public class PolygonActor implements Actor {
	protected Polygon shape;
	protected Color color;
	protected int dx = 0, dy = 0;

	public PolygonActor(Polygon shape, Color color) {
		this.shape = shape;
		this.color = color;
	}

	public void setVelocity(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillPolygon(shape);
	}

	@Override
	public void step() {
		shape.translate(dx, dy);
	}

	@Override
	public void handleCollision(Actor other) {
		dx = -dx;
		dy = -dy;
	}
}