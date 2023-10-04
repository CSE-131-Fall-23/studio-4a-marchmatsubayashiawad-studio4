package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(75, 255, 150);
		StdDraw.filledRectangle(4, 4, 4, 4);
		StdDraw.setPenColor(175, 0, 200);
		StdDraw.filledCircle(.25, .5, .25);
		StdDraw.setPenColor(0,100,225);
		StdDraw.filledRectangle(.5,.5, .25, .25);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.75, .5, .25);
		
	}
}