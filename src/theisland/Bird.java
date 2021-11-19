package theisland;
/**
 *shows the bird's attributes child class of Animal
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class Bird extends Animal {
/**
 * Constructor for animals
 * For invocation by subclass constructors, typically implicit.
 * @param species bird's species
 * @param name    bird's name
 * @param symbol  bird's symbol
 * @param x   bird's x position
 * @param y   bird's y position
 * @param size  bird's size
 * @param hungerLevel   bird's hungerLevel
 * @param thirstLevel   bird's thirstLevel
 * @param canFly   bird's canFly
 */
	public Bird(String species, String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel,
			Boolean canFly) {
		super("Bird", name, symbol, x, y, size, hungerLevel, thirstLevel, canFly);
	}

}
