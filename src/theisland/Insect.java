package theisland;

/**
 * shows the Insect' attributes child class of Animal.
 * 
 * @author Liang Zhao
 * @version 1.0
 *
 */
public class Insect extends Animal {
/**
 * Constructor for Animal
 * For invocation by subclass constructors, typically implicit.
 * @param species insect's species
 * @param name  insect's name
 * @param symbol  insect's symbol
 * @param x  insect's x position
 * @param y  insect's y position
 * @param size  insect's size
 * @param hungerLevel  insect's hungerLevel
 * @param thirstLevel  insect's thirstLevel
 * @param canFly  if insect can fly
 */

	public Insect(String species, String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel,
			boolean canFly) {
		super("Insect", name, 'I', x, y, size, hungerLevel, thirstLevel, canFly);

	}

	/**
	 * defines the aggressive behavior 
	 * can lay eggs
	 */
	public void layEgg() {

	}

}
