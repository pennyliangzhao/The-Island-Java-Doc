package theisland;

/**
 * shows the Ground's attributes child class of GeographicFeature.
 * 
 * @author Liang Zhao
 * @version 1.0
 */
public class Ground extends GeographicFeature {
	/**
	 * Constructor for GeographicFeature
	 * For invocation by subclass constructors, typically implicit.
	 * 
	 * @param name ground's name
	 * @param symbol ground's symbol
	 * @param x ground's x position
	 * @param y ground's y position
	 * @param size ground's size
	 * @param width ground's width
	 * @param height ground's height
	 */
	public Ground(String name, char symbol, int x, int y, int size, int width, int height) {
		super("Ground", symbol, x, y, size, width, height);

	}

}
