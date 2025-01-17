package chapter16exercises;

import java.awt.Color;
import java.awt.Graphics;

public class Cell {
	private final int x;
	private final int y;
	private final int size;
	private int state;

	public static final int OFF = 0;
	public static final int ON = 1;
	public static final int DYING = 2;

	public static final Color[] COLORS = { Color.WHITE, Color.BLACK, Color.GRAY };

	public Cell(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.state = OFF;
	}

	public void draw(Graphics g) {
		g.setColor(COLORS[state]);
		g.fillRect(x + 1, y + 1, size - 1, size - 1);
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(x, y, size, size);
	}

	public boolean isOff() {
		return state == OFF;
	}

	public boolean isOn() {
		return state == ON;
	}

	public boolean isDying() {
		return state == DYING;
	}

	public void turnOff() {
		state = OFF;
	}

	public void turnOn() {
		state = ON;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}
}