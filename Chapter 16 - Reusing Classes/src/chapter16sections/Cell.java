package chapter16sections;

import java.awt.Color;
import java.awt.Graphics;

public class Cell {
	private final int x;
	private final int y;
	private final int size;
	private int state;

	public Cell(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.state = 0;
	}

	public static final Color[] COLORS = { Color.WHITE, Color.BLACK };

	public void draw(Graphics g) {
		g.setColor(COLORS[state]);
		g.fillRect(x + 1, y + 1, size - 1, size - 1);
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(x, y, size, size);
	}

	public boolean isOff() {
		return state == 0;
	}

	public boolean isOn() {
		return state == 1;
	}

	public void turnOff() {
		state = 0;
	}

	public void turnOn() {
		state = 1;
	}

	public static void main(String[] args) {
		int rows = 4;
		int cols = 3;
		int size = 20;
		Cell[][] array = new Cell[rows][cols];

		for (int r = 0; r < rows; r++) {
			int y = r * size;
			for (int c = 0; c < cols; c++) {
				int x = c * size;
				array[r][c] = new Cell(x, y, size);
			}
		}
	}
}
