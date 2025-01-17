package chapter15sections;

import java.awt.Canvas;
import java.awt.Graphics;

public class GridCanvas extends Canvas {
	private Cell[][] array;

	public GridCanvas(int rows, int cols, int size) {
		array = new Cell[rows][cols];
		for (int r = 0; r < rows; r++) {
			int y = r * size;
			for (int c = 0; c < cols; c++) {
				int x = c * size;
				array[r][c] = new Cell(x, y, size);
			}
		}
		setSize(cols * size, rows * size);
	}

	public void draw(Graphics g) {
		for (Cell[] row : array) {
			for (Cell cell : row) {
				cell.draw(g);
			}
		}
	}

	public void paint(Graphics g) {
		draw(g);
	}
}