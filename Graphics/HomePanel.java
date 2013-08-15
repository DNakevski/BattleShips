package Battleships.Graphics;
/*
 * Author: Michael
 * Created: 16 April 2005 15:44:52
 * Modified: 16 April 2005 15:44:52
 */

import javax.swing.*;


import java.awt.*;

public class HomePanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		this.setSize(200,200);
		
		setBackground(Color.blue);
		super.paintComponent(g);
		// ship objects hold their starting co-ord and orientation
		
		DrawGrid.paint(g,0,0);
		
	}

}
