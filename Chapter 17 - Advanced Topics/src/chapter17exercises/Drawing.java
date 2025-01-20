package chapter17exercises;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Drawing extends Canvas {
	private java.util.List<Actor> actors = new ArrayList<>();

	public void addActor(Actor actor) {
		actors.add(actor);
	}

	public java.util.List<Actor> getActors() {
		return actors;
	}

	@Override
	public void paint(Graphics g) {
		for (Actor actor : actors) {
			actor.draw(g);
		}
	}

	public void step() {
		for (Actor actor : actors) {
			actor.step();
		}
		detectCollisions();
		repaint();
	}

	private void detectCollisions() {
		for (int i = 0; i < actors.size(); i++) {
			for (int j = i + 1; j < actors.size(); j++) {
				Actor a = actors.get(i);
				Actor b = actors.get(j);

				if (a instanceof PolygonActor pa && b instanceof PolygonActor pb) {
					if (pa.shape.getBounds().intersects(pb.shape.getBounds())) {
						a.handleCollision(b);
						b.handleCollision(a);
					}
				}
			}
		}
	}
}