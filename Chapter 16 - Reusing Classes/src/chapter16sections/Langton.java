package chapter16sections;

import javax.swing.JFrame;

public class Langton {

	private GridCanvas grid;
	private int xpos;
	private int ypos;
	private int head;

	public Langton(int rows, int cols) {
		grid = new GridCanvas(rows, cols, 10);
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

	public void update() {
		flipCell();
		moveAnt();
	}

	private void mainloop() {
		while (true) {

			this.update();
			grid.repaint();

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {
		String title = "Langton's Ant";
		Langton game = new Langton(61, 61);
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game.grid);
		frame.pack();
		frame.setVisible(true);
		game.mainloop();
	}

}