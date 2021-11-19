package theisland;

/**
 * shows the AppleTree's attributes child class of Foliage
 *
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class AppleTree extends Foliage {
	/**
	 * Constructor for Foliage
	 * For invocation by subclass constructors, typically implicit.
	 * @param name  apple tree 's name
	 * @param symbol apple tree 's symbol
	 * @param size  apple tree 's size
	 * @param x   apple tree 's x position
	 * @param y  apple tree 's y position
	 */

	public AppleTree(String name, char symbol, int size, int x, int y) {
		super("Apple Tree", symbol, size, x, y);

	}

}
