package theisland;
/**
 * shows the Sparrow's attributes child class of Bird and implements Omnivore and Food interface.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Sparrow extends Bird implements Omnivore, Food {
	/**
	 * Constructor for Bird
	 * For invocation by subclass constructors, typically implicit.
	 * @param name Sparrow's name
	 * @param symbol Sparrow's name
	 * @param x Sparrow x position
	 * @param y Sparrow y position
	 * @param size  Sparrow's size
	 * @param hungerLevel  Sparrow hungerLevel
	 * @param thirstLevel  Sparrow thirstLevel
	 */
	public Sparrow(String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel) {
		super("Sparrow", name, symbol, x, y, size, hungerLevel, thirstLevel, true);

	}
	/**
	 * {@inheritDoc} inherited from Omnivore,define the aggressive behavior
	 * can eat meat and also vegetables
	 * 
	 * <p>The method allows the instance to be overridden,providing it it eligible
	 * 
	 */
	@Override
	public void isEatinghthings() {

	}

}
