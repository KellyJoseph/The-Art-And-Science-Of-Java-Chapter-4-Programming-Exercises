package Chapter4Exercises;

import acm.program.*;
import acm.gui.*;
import acm.graphics.*;

public class Pyramid extends GraphicsProgram {
	
	
	
	
	public void run() {
		
		for (int i = 1; i <= BRICKS_IN_BASE; i++) {
			for (int j= 0; j < i; j++) {
				int x = BRICK_WIDTH * j;
				int y = BRICK_HEIGHT * i;
				
				GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(rect);
			}
		}
				
				
	}
	
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE = 12;
}