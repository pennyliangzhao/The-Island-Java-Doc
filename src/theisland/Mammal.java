package theisland;

/**
 * shows the Mammal's attributes child class of Animal
 * Parameters are
 * speed- mammal's speed-1-10,10 being the fast.e.g.wolv
 * isFemale-mammal's gender,boolean true-if it is female or false-is male
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Mammal extends Animal {
	private int speed;
	private boolean isFemale;

	/**
	 * Constructor for Animal For invocation by subclass constructors, typically
	 * implicit.
	 * 
	 * @param species mammal's species
	 * @param name   mammal's  name
	 * @param symbol  mammal's symbol
	 * @param x  mammal's x position
	 * @param y  mammal's y position
	 * @param size  mammal's size
	 * @param hungerLevel  mammal's hungerLevel
	 * @param thirstLevel  mammal's thirstLevel
	 * @param speed  mammal's speed
	 * @param isFemale  if the mammal is female
	 */
	public Mammal(String species, String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel,
			int speed, boolean isFemale) {
		super(species, name, symbol, x, y, size, hungerLevel, thirstLevel, false);
		this.speed = speed;
		this.isFemale = isFemale;
	}

	/**
	 * Return speed of Mammals
	 * 
	 * @return speed of Mammals
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Set the speed of Mammals
	 * 
	 * @param speed of Mammals
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * Return mammals gender Female return true or male return false
	 * 
	 * @return isFemale boolean true or false
	 */
	public boolean isFemale() {
		return isFemale;
	}

	/**
	 * Set mammals gender Female return true or male return false
	 * @param isFemale boolean true or false
	 */
	
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	/**
	 * defines the aggressive behavior
	 * can reproduct
	 */
	public void reproduct() {

	}
}
