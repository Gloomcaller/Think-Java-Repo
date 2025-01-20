package chapter17exercises;

import java.awt.*;
import java.awt.event.*;

public class Sprite implements Actor, KeyListener {
	private int x, y, dx = 0, dy = 0;
	private Image image;

	public Sprite(String imagePath, int x, int y) {
		this.x = x;
		this.y = y;
		try {
			image = Toolkit.getDefaultToolkit().getImage(imagePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(image, x, y, null);
	}

	@Override
	public void step() {
		x += dx;
		y += dy;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP -> dy = -5;
		case KeyEvent.VK_DOWN -> dy = 5;
		case KeyEvent.VK_LEFT -> dx = -5;
		case KeyEvent.VK_RIGHT -> dx = 5;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP, KeyEvent.VK_DOWN -> dy = 0;
		case KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT -> dx = 0;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}