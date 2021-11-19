package theisland;
/**
 * shows the Fish's attributes child class of Animal 
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Fish extends Animal {
/**
 * Constructor for animals
 * For invocation by subclass constructors, typically implicit.
 * 
 * @param species  fish's species
 * @param name  fish's name
 * @param symbol  fish's symbol 
 * @param x  fish's x position
 * @param y  fish's y position
 * @param size  fish's size
 * @param hungerLevel  fish's hungerLevel
 * @param thirstLevel  fish's thirstLevel
 */
	public Fish(String species, String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel) {
		super("Fish", name, symbol, x, y, size, hungerLevel, thirstLevel, false);
	}

	/**
	 * defines the aggressive behavior
	 * can lay eggs
	 */
	public void layEgg() {
	}
}
