package theisland;
/**
 * shows the Stream's attributes child class of GeographicFeature.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Stream extends GeographicFeature {
	/**
	 * Constructor for GeographicFeature 
	 * For invocation by subclass constructors,typically implicit.
	 * 
	 * @param name  stream's name
	 * @param symbol stream's symbol
	 * @param x  stream's x position
	 * @param y  stream's y position
	 * @param size stream's size
	 * @param width  stream's width
	 * @param height  stream's height
	 */
	public Stream(String name, char symbol, int x, int y, int size, int width, int height) {
		super("Stream", symbol, x, y, size, width, height);

	}

}