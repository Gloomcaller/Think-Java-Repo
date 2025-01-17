package chapter16exercises;

public class BriansBrain extends Automaton {

	public BriansBrain(int rows, int cols, int cellSize) {
		grid = new GridCanvas(rows, cols, cellSize);
	}

	@Override
	public void update() {
		int rows = grid.numRows();
		int cols = grid.numCols();
		int[][] newStates = new int[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				Cell cell = grid.getCell(r, c);
				int neighbors = countAliveNeighbors(r, c);

				if (cell.isOn()) {
					newStates[r][c] = 2;
				} else if (cell.isOff() && neighbors == 2) {
					newStates[r][c] = 1;
				} else if (cell.isDying()) {
					newStates[r][c] = 0;
				} else {
					newStates[r][c] = cell.getState();
				}
			}
		}

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				Cell cell = grid.getCell(r, c);
				cell.setState(newStates[r][c]);
			}
		}
	}

	private int countAliveNeighbors(int r, int c) {
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

	public static void main(String[] args) {
		String title = "Brian's Brain";
		BriansBrain game = new BriansBrain(50, 50, 10);
		game.run(title, 10);
	}
}