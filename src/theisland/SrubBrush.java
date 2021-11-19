package theisland;
/**
 * shows the SrubBrush's attributes child class of Foliage 
 * 
 * @author Liang Zhao
 * @version 1.0
 *
 */
public class SrubBrush extends Foliage {
	/**
	 * Constructor for Foliages
	 * For invocation by subclass constructors, typically implicit.
	 * 
	 * @param name  SrubBrush's name
	 * @param symbol  SrubBrush's symbol
	 * @param size  SrubBrush's size
	 * @param x  SrubBrush's x position
	 * @param y  SrubBrush's y position
	 */
	public SrubBrush(String name, char symbol, int size, int x, int y) {
		super("Srub Brush", '#', size, x, y);

	}

}
