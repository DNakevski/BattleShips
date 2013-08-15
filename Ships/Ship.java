package Battleships.Ships;
/*
 * Author: Michael
 * Created: 07 December 2004 15:52:31
 * Modified: 07 December 2004 15:52:31
 */

import java.io.Serializable;

import Battleships.Grid;
import Battleships.exception.PositionExceedsBoardException;
import Battleships.exception.PositionOccupiedException;


public abstract class Ship implements Serializable
{
	protected void placeShipOnGrid(Grid board, int i, int j, boolean isHorizontal, int segments) 
	{
		board.placeShipOnGrid(this, i, j, isHorizontal, segments);
	}


	public int shipGridValue() {
		return this.GetGridValue();
	}
	
	public abstract int GetGridValue();
	
	public abstract void scoreHit();
	
	public abstract boolean isSunk();
	
	public abstract String GetName();
}
