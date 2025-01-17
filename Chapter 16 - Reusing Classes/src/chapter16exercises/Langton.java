package chapter16exercises;

public class Langton extends Automaton {
	private int xpos;
	private int ypos;
	private int head;

	public Langton(int rows, int cols, int cellSize) {
		grid = new GridCanvas(rows, cols, cellSize);
		xpos = rows / 2;
		ypos = cols / 2;
		head = 0;
	}

	private void flipCell() {
		Cell cell = grid.getCell(xpos, ypos);
		if (cell.isOff()) {
			head = (head + 1) % 4;
			cell.turnOn();
		} else {
			head = (head + 3) % 4;
			cell.turnOff();
		}
	}

	private void moveAnt() {
		if (head == 0) {
			ypos -= 1;
		} else if (head == 1) {
			xpos += 1;
		} else if (head == 2) {
			ypos += 1;
		} else {
			xpos -= 1;
		}
	}

	@Override
	public void update() {
		flipCell();
		moveAnt();
	}

	public static void main(String[] args) {
		String title = "Langton's Ant";
		Langton game = new Langton(61, 61, 10);
		game.run(title, 500);
	}
}