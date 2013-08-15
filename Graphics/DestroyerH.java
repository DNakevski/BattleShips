package Battleships.Graphics;
/* File: DestroyerH.java	
Instructions to draw a Destroyer on the screen.
*/
	
import java.awt.*;

public class DestroyerH 
{
	/**
		Constructs a Destroyer with a given top left corner.
		@param x the x-coordinate of the top left corner
		@param y the y-coordinate of the top left corner
	*/

	public static void paint(Graphics g, int xLeft, int yTop)
		{
			//Ellipse2D.Double(xLeft,yTop,80,40,);
			
			Color navyGrey = new Color( 180, 180, 180);			
			
			
			//draw main body of ship
			g.setColor(navyGrey);
			g.fillOval(xLeft, yTop, 60, 20);
			//draw detail
			g.setColor(Color.black);	
			
			g.drawOval(xLeft, yTop, 60, 20); //outline
			g.setColor(navyGrey);
			g.fillRect(xLeft+20,yTop,40,20);
			
			g.setColor(Color.black);
			
						
			//Mid deck tower
			g.drawRect(xLeft+40,yTop+5,15,10);			
			g.drawLine(xLeft+40,yTop+5,xLeft+20,yTop+10);
			g.drawLine(xLeft+20,yTop+10,xLeft+40,yTop+15);
			g.drawRect(xLeft+45,yTop+8,5,5);
			
			//Gun Barrel
			g.drawOval(xLeft+5, yTop +5, 10, 10);
			g.drawLine(xLeft,yTop+10,xLeft+10,yTop+10);
			
			//Outline of the stern of the ship
			g.drawLine(xLeft+20,yTop,xLeft+60,yTop);
			g.drawLine(xLeft+60,yTop,xLeft+60,yTop+20);
			g.drawLine(xLeft+60,yTop+20,xLeft+20,yTop+20);
			
			


		
		}
		
}			
