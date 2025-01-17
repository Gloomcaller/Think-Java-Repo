package chapter15sections;

import javax.swing.JFrame;

public class Conway {

	private GridCanvas grid;

	public Conway() {
		grid = new GridCanvas(5, 10, 20);
		grid.turnOn(2, 1);
		grid.turnOn(2, 2);
		grid.turnOn(2, 3);
		grid.turnOn(1, 7);
		grid.turnOn(2, 7);
		grid.turnOn(3, 7);
	}

	private int countAlive(int r, int c) {
		int count = 0;
		count += grid.test(r - 1, c - 1);
		count += grid.test(r - 1, c);
		count += grid.test(r - 1, c + 1);
		count += grid.test(r, c - 1);
		count += grid.test(r, c + 1);
		count += grid.test(r + 1, c - 1);
		count += grid.test(r + 1, c);
		count += grid.test(r + 1, c + 1);
		return count;
	}

	private static void updateCell(Cell cell, int count) {
		if (cell.isOn()) {
			if (count < 2 || count > 3) {
				cell.turnOff();
			}
		} else {
			if (count == 3) {
				cell.turnOn();
			}
		}
	}

	private int[][] countNeighbors() {
		int rows = grid.numRows();
		int cols = grid.numCols();

		int[][] counts = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				counts[r][c] = countAlive(r, c);
			}
		}
		return counts;
	}

	private void updateGrid(int[][] counts) {
		int rows = grid.numRows();
		int cols = grid.numCols();

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				Cell cell = grid.getCell(r, c);
				updateCell(cell, counts[r][c]);
			}
		}
	}

	public void update() {
		int[][] counts = countNeighbors();
		updateGrid(counts);
	}

	private void mainloop() {
		while (true) {

			this.update();
			grid.repaint();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {
		String title = "Conway's Game of Life";
		Conway game = new Conway();
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game.grid);
		frame.pack();
		frame.setVisible(true);
		game.mainloop();
	}

}