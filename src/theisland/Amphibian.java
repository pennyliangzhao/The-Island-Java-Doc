package theisland;

/**
 * shows the Amphibian's attributes child class of Animal
 *
 * @author Liang Zhao
 * @version 1.0
 */

public class Amphibian extends Animal {
	/**
	 * Constructor for animals
     * For invocation by subclass constructors, typically implicit.
     * 
	 * @param species  Amphibian's species
	 * @param name     Amphibian's name
	 * @param symbol   Amphibian's symbol
	 * @param x        Amphibian's  x position
	 * @param y        Amphibian's  y position
	 * @param size     Amphibian's  size
	 * @param hungerLevel Amphibian's  hungerLevel
	 * @param thirstLevel  Amphibian's thirstLevel
	 */

	public Amphibian(String species, String name, char symbol, int x, int y, int size, int hungerLevel,
			int thirstLevel) {
		super("Amphibian", name, symbol, x, y, size, hungerLevel, thirstLevel, false);

	}
/**
 * defines the aggressive behavior 
 * can lay egg
 */
	public void layEgg() {

	}
}