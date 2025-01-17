package chapter15exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class Conway {

	private GridCanvas grid;

	public Conway(String path) {
		ArrayList<String> lines = new ArrayList<>();
		try {
			File file = new File(path);
			Scanner scan = new Scanner(file);

			if (path.endsWith(".rle")) {
				parseRLE(scan);
			} else {
				while (scan.hasNextLine()) {
					String line = scan.nextLine().trim();
					if (!line.startsWith("!")) {
						lines.add(line);
					}
				}

				scan.close();

				int rows = lines.size();
				int cols = lines.get(0).length();

				grid = new GridCanvas(rows, cols, 20);

				for (int r = 0; r < rows; r++) {
					String row = lines.get(r);
					for (int c = 0; c < cols; c++) {
						if (row.charAt(c) == 'O') {
							grid.turnOn(r, c);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private void parseRLE(Scanner scan) {
		ArrayList<String> patternLines = new ArrayList<>();
		int rows = 0, cols = 0;

		while (scan.hasNextLine()) {
			String line = scan.nextLine().trim();

			if (line.startsWith("#")) {
				continue;
			} else if (line.startsWith("x =")) {
				String[] parts = line.split(",");
				cols = Integer.parseInt(parts[0].split("=")[1].trim());
				rows = Integer.parseInt(parts[1].split("=")[1].trim());
			} else {
				patternLines.add(line);
			}
		}

		grid = new GridCanvas(rows, cols, 20);

		int r = 0, c = 0;
		for (String line : patternLines) {
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);

				if (ch == '!') {
					return;
				} else if (Character.isDigit(ch)) {
					int count = ch - '0';
					char next = line.charAt(++i);

					for (int j = 0; j < count; j++) {
						if (next == 'o') {
							grid.turnOn(r, c);
						}
						c++;
					}
				} else if (ch == 'o') {
					grid.turnOn(r, c++);
				} else if (ch == 'b') {
					c++;
				} else if (ch == '$') {
					r++;
					c = 0;
				}
			}
		}
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
		Conway game = new Conway("src/chapter15exercises/glider.cells");
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game.grid);
		frame.pack();
		frame.setVisible(true);
		game.mainloop();
	}

}