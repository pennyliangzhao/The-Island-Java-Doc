package theisland;

/**
 * 
 * Wolf class that shows the Wolf's attributes child class of Mammal and
 * implements Carnivore interface.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class Wolf extends Mammal implements Carnivore {
	/**
	 * Constructor for Mammals 
	 * For invocation by subclass constructors, typically implicit.
	 * 
	 * @param species wolf's species
	 * @param name wolf's name
	 * @param symbol  wolf's  symbol
	 * @param x  wolf's x position 
	 * @param y  wolf's position
	 * @param size  wolf's size
	 * @param hungerLevel  wolf's  hungerLevel
	 * @param thirstLevel  wolf's thirstLevel
	 * @param speed  wolf's speed
	 * @param isFemale  if wolf is female
	 */

	public Wolf(String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel, int speed,
			boolean isFemale) {
		super("Wolf", name, symbol, x, y, size, hungerLevel, thirstLevel, speed, isFemale);

	}
	/**
	 * {@inheritDoc} inherited from Carnivore,define the aggressive behavior
	 * can eatMeat
	 * <p>The method allows the instance to be overridden,providing it it eligible
	 * 
	 */
	@Override
	public void isEatingMeat() {

	}

}
