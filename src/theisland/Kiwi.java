package theisland;
/**
 * shows the Kiwi's attributes child class of Bird and implements Omnivore and Food interface.
 * 
 * @author Liang Zhao
 * @version 1.0
 *
 */
public class Kiwi extends Bird implements Omnivore, Food {
/**
 * Constructor for Bird
 * For invocation by subclass constructors, typically implicit.
 * @param name kiwi's name
 * @param symbol  kiwi's symbol
 * @param x  kiwi's x position
 * @param y  kiwi's y position
 * @param size  kiwi's size
 * @param hungerLevel  kiwi's hungerLevel
 * @param thirstLevel  kiwi's thirstLevel
 * @param speed  kiwi's speed
 */

	public Kiwi(String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel, int speed) {
		super("Kiwi", name, symbol, x, y, size, hungerLevel, thirstLevel, false);

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
