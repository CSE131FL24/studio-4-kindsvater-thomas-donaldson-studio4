package studio4;
import java.util.Scanner;
import java.awt.Color;
import java.io.File;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String shapeType = "rectangle";
		StdDraw.setScale(0,3);

		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledRectangle(0.5, 0.5, 6, .5);
		
		
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledRectangle(.5, 1.5, 3, 0.5 );
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(.5, 2.5 , 3, 0.5);
		
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledEllipse( 1.5, 1.5, 1, .5);
		
		double [] x = {0.1,0.2,0.3,0.2};
		double [] y = {0.1,0.2,0.3,0.2};
		
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.polygon(x, y);
		

		
		
		
		
	}
}