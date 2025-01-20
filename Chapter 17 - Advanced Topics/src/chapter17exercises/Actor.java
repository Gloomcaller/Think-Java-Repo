package chapter17exercises;

import java.awt.*;

public interface Actor {
	void draw(Graphics g);

	void step();

	default void handleCollision(Actor other) {
	}
}