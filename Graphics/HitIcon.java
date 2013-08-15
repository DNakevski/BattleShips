package Battleships.Graphics;
/* File: Hit.java	
Instructions to draw a splash, signifing a missed shot on the screen.
*/
	
import java.awt.*;

public class HitIcon 
{
	/**
		Constructs a splash shape with a given top left corner.
		@param x the x-coordinate of the top left corner
		@param y the y-coordinate of the top left corner
	*/

	public static void paint(Graphics g, int xLeft, int yTop)
		{
			Color fire1 = new Color( 250, 185, 050);//Creates the colour for the foam
			Color fire2 = new Color( 250, 137, 0);// Creates and sets the colour of the sea
			
					
			g.setColor(fire1);
			g.fillOval(xLeft, yTop, 20, 20);
			
			
			g.setColor(fire2);
			g.fillOval(xLeft+4, yTop +4, 13, 13);
			
			
			g.setColor(fire1);
			g.fillOval(xLeft+8, yTop +8, 5, 5);
		
		}
		
}	
