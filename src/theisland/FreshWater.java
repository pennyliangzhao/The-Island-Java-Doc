package theisland;
/**
 * shows the freshWater attributes child class of GeographicFeature 
 * 
 * @author Liang Zhao
 * @version 1.0
 *
 */
public class FreshWater extends GeographicFeature {
/**
 * Constructor for GeographicFeature
 * For invocation by subclass constructors, typically implicit.
 * 
 * @param name freshwater's name
 * @param symbol freshwater's symbol
 * @param x freshwater's x position
 * @param y freshwater's y position
 * @param size freshwater's size
 * @param width freshwater's width
 * @param height freshwater's height
 */
	public FreshWater(String name, char symbol, int x, int y, int size, int width, int height) {
		super("Fresh Water", symbol, x, y, size, width, height);

	}

}
