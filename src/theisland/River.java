package theisland;
/**
 * shows the River's attributes child class of GeographicFeature.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class River extends GeographicFeature {
	/**
	 * Constructor for GeographicFeature 
	 * For invocation by subclass constructors, typically implicit.
	 * 
	 * @param name river's name
	 * @param symbol river's symbol
	 * @param x  river's x position
	 * @param y  river's y position
	 * @param size  river's size
	 * @param width  river's width
	 * @param height  river's height
	 */

	public River(String name, char symbol, int x, int y, int size, int width, int height) {
		super("River", symbol, x, y, size, width, height);

	}

}
