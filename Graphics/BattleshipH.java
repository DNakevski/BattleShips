package Battleships.Graphics;
/* File: BattleshipH.java	
Instructions to draw a Horzonatal Battleship on the screen.
*/
	
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class BattleshipH 
{
	/**
		Constructs a horizontal Battleship with a given top left corner.
		@param x the x-coordinate of the top left corner
		@param y the y-coordinate of the top left corner
	*/
	
	public static void paint(Graphics g, int xLeft, int yTop)
		{
			Color navyGrey = new Color( 180, 180, 180);			
			
			//s= 1;
			
			//draw main body of ship
			g.setColor(navyGrey);
			g.fillOval(xLeft, yTop, 80, 20);
			
			
			
			//draw detail
			g.setColor(Color.black);	
			
			
			
			
			g.drawOval(xLeft, yTop, 80, 20); //outline
			g.setColor(navyGrey);
				
				
						
			//Mid deck tower
			g.setColor(Color.black);
			g.drawRect(xLeft+40,yTop+5,15,10);
			g.drawLine(xLeft+40,yTop+5,xLeft+20,yTop+10);
			g.drawLine(xLeft+20,yTop+10,xLeft+40,yTop+15);
			g.drawRect(xLeft+45,yTop+7,5,5);
			g.drawLine(xLeft+55,yTop+5,xLeft+63,yTop+10);
			g.drawLine(xLeft+63,yTop+10,xLeft+55,yTop+15);
			
			//Draw Top Gun Barrel
			g.drawOval(xLeft+5, yTop +5, 10, 10);
			g.drawLine(xLeft,yTop+13,xLeft+10,yTop+13);
			g.drawLine(xLeft,yTop+8,xLeft+10,yTop+8);
			
			//Draw Bottom Gun Barrel
			g.drawOval(xLeft+65, yTop +5, 10, 10);
			g.drawLine(xLeft+70,yTop+8,xLeft+80,yTop+8);
			g.drawLine(xLeft+70,yTop+13,xLeft+80,yTop+13);

		}

}			