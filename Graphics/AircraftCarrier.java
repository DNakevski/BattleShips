package Battleships.Graphics;
/* File: AircraftCarrier.java	
Instructions to draw a AircraftCarrier on the screen.
*/
	
import java.awt.*;

public class AircraftCarrier 
{
	/**
		Constructs a AircraftCarrier with a given top left corner.
		@param x the x-coordinate of the top left corner
		@param y the y-coordinate of the top left corner
	*/
	
	public static void paint(Graphics g, int xLeft, int yTop)
		{
			Color navyGrey = new Color( 180, 180, 180);			
			
			
			//draw main body of ship
			g.setColor(navyGrey);
			g.fillRect(xLeft, yTop, 20, 100);
			
			//draw detail
			g.setColor(Color.black);	
			
			g.drawRect(xLeft, yTop, 20, 100); //outline
			//g.setColor(navyGrey);
				
			//Mid deck tower
			g.drawRect(xLeft+15,yTop+40,5,20);
			g.drawRect(xLeft+17,yTop+45,3,10);
			
			//Draw Runway
			
			g.setColor(Color.white);
			g.fillRect(xLeft+10,yTop+3,1,10);
			g.fillRect(xLeft+10,yTop+15,1,10);
			g.fillRect(xLeft+10,yTop+27,1,10);
			g.fillRect(xLeft+10,yTop+40,1,10);
			g.fillRect(xLeft+10,yTop+53,1,10);
			g.fillRect(xLeft+10,yTop+65,1,10);
			g.fillRect(xLeft+10,yTop+76,1,10);
			g.fillRect(xLeft+10,yTop+90,1,7);
			
		}
		
}			


