package theisland;

/**
 * shows the PineTree's attributes child class of Foliage 
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class PineTree extends Foliage {
/**
 * Constructor for Foliages
 * For invocation by subclass constructors, typically implicit.
 * 
 * @param name pinetree's name
 * @param symbol pinetree's symbol
 * @param size pinetree's size
 * @param x pinetree's x position
 * @param y pinetree's y position
 */
	public PineTree(String name, char symbol, int size, int x, int y) {
		super("PineTree",symbol, size, x, y);

	}

}
