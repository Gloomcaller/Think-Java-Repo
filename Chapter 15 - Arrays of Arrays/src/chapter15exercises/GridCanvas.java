package chapter15exercises;

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

	public void update(Graphics g) {
		draw(g);
	}

	public int numRows() {
		return array.length;
	}

	public int numCols() {
		return array[0].length;
	}

	public Cell getCell(int r, int c) {
		return array[r][c];
	}

	public void turnOn(int r, int c) {
		array[r][c].turnOn();
	}

	public int test(int r, int c) {
		int rows = numRows();
		int cols = numCols();

		r = (r + rows) % rows;
		c = (c + cols) % cols;

		if (array[r][c].isOn()) {
			return 1;
		}
		return 0;
	}

	public int countOn() {
		int count = 0;
		for (Cell[] row : array) {
			for (Cell cell : row) {
				if (cell.isOn()) {
					count++;
				}
			}
		}
		return count;
	}

}