package chapter17exercises;

import java.awt.*;
import java.awt.event.*;

public class MouseActor implements Actor, MouseListener {
	private int x = 0, y = 0;
	private boolean clicked = false;

	@Override
	public void draw(Graphics g) {
		g.setColor(clicked ? Color.RED : Color.BLUE);
		g.fillOval(x - 15, y - 15, 30, 30);
	}

	@Override
	public void step() {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		clicked = true;
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}