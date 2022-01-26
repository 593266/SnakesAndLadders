package entity;


/**
 * 
 * @author janwi
 *
 * The squares a piece can stand on. Each square might have a ladder or snake that takes
 * you forward or backwards. 
 */
public class Square {
	
	int jump;
	
	public Square(int jump) {
		this.jump = jump;
	}

	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}
}
