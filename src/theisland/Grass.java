package theisland;

/**
 * shows the Grass's attributes child class of Foliage
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
class Grass extends Foliage {
/**
 * Constructor for Foliage
 * For invocation by subclass constructors, typically implicit.
 * @param name
 * @param symbol
 * @param size
 * @param x
 * @param y
 */
	public Grass(String name, char symbol, int size, int x, int y) {
		super("Grass", symbol, size, x, y);

	}

}
