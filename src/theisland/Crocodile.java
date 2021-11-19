package theisland;
/**
 * shows the Crocodile's attributes child class of Mammal and implements Carnivore interface.
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class Crocodile extends Amphibian implements Carnivore {
	/**
	 * Constructor for Amphibian
     * For invocation by subclass constructors, typically implicit.
	 * @param species  crocodile's species
	 * @param name  crocodile's name
	 * @param symbol  crocodile's symbol 
	 * @param x  crocodile's x position
	 * @param y  crocodile's y position
	 * @param size  crocodile's size
	 * @param hungerLevel  crocodile's hungerLevel
	 * @param thirstLevel  crocodile's thirstLevel
	 */

	public Crocodile(String species, String name, char symbol, int x, int y, int size, int hungerLevel,
			int thirstLevel) {
		super("Crocodile", name,symbol, x, y, size, hungerLevel, thirstLevel);

	}
	/**
	 * {@inheritDoc} inherited from Carnivore,define the aggressive behavior
	 * can eatMeat
	 * 
	 * <p>The method allows the instance to be overridden,providing it it eligible
	 * 
	 */
	@Override
	public void isEatingMeat() {

	}

}
