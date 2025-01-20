package chapter17sections;

import java.awt.Color;

public class RegularPolygon extends DrawablePolygon {

	public RegularPolygon(int nsides) {
		this(nsides, 50);
	}

	public RegularPolygon(int nsides, int radius) {
		this(nsides, radius, Color.GRAY);
	}

	public RegularPolygon(int nsides, int radius, Color color) {

		if (nsides < 3) {
			throw new IllegalArgumentException("invalid nsides");
		}
		if (radius <= 0) {
			throw new IllegalArgumentException("invalid radius");
		}
		if (color == null) {
			throw new NullPointerException("invalid color");
		}

		this.npoints = nsides;
		this.xpoints = new int[nsides];
		this.ypoints = new int[nsides];
		this.color = color;

		double theta = 2.0 * Math.PI / nsides;

		double rotate = Math.PI / nsides + Math.PI / 2.0;

		for (int i = 0; i < nsides; i++) {
			double x = radius * Math.cos(i * theta + rotate);
			double y = radius * Math.sin(i * theta + rotate);
			xpoints[i] = (int) Math.round(x);
			ypoints[i] = (int) Math.round(y);
		}
	}

}