package entity;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author janwi
 * 
 *@param board - Board as a list of 100 squares
 */
public class Board {

	List<Square> board;
	
	
	public Board() {
		this.board = new ArrayList<Square>(100);
	}

	public List<Square> getSquares() {
		return board;
	}

	public void setSquares(List<Square> squares) {
		this.board = squares;
	}
	
}
