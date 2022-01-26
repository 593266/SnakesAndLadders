package entity;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author janwi
 * 
 * The dice object
 *
 * @param value - value of dice 
 */
public class Dice {

	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
