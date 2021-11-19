package theisland;
/**
 * shows the Rat's attributes child class of Mammal
 * and implement Carnivore and Food interfaces.
 * 
 * @author Liang Zhao
 * @version 1.0
 *
 */
public class Rat extends Mammal implements Carnivore, Food {
	/**
	 * Constructor for Mammals
     * For invocation by subclass constructors, typically implicit.
	 * @param name rat's name
	 * @param symbol rat's symbol
	 * @param x rat's x position
	 * @param y rat's  position
	 * @param size rat's size
	 * @param hungerLevel rat's  hungerLevel
	 * @param thirstLevel rat's  thirstLevel
	 * @param speed rat's speed
	 * @param isFemale if rat is female
	 */

	public Rat(String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel, int speed,
			boolean isFemale) {
		super("Rat", name, symbol, x, y, size, hungerLevel, thirstLevel, speed, isFemale);

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