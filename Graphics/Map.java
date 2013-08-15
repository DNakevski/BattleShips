package Battleships.Graphics;
/* File: Miss.java	
Instructions to draw a splash, signifing a missed shot on the screen.
*/
	
import java.awt.*;

public class Map// extends Graphics2D
{
	/**
		Constructs a splash shape with a given top left corner.
		@param x the x-coordinate of the top left corner
		@param y the y-coordinate of the top left corner
	*/
	

	public static void paint(Graphics g, int xLeft, int yTop, int val)
		{
			
			g.setColor(Color.BLACK);				
			
			g.fillRect(xLeft, yTop, 20, 20);
			
			
		}
		
}			