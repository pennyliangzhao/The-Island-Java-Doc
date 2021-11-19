package theisland;
/**
 * shows the Platypus's attributes child class of Amphian and implement Carnivore interface.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Platypus extends Amphibian implements Carnivore {
/**
 * Constructor for Amphibian
 * For invocation by subclass constructors, typically implicit.
 * 
 * @param species  platypus's species
 * @param name  platypus's name
 * @param symbol  platypus's symbol
 * @param x  platypus's x position
 * @param y  platypus's y position 
 * @param size  platypus's size
 * @param hungerLevel  platypus's hungerLevel
 * @param thirstLevel  platypus's thirstLevel
 */
	public Platypus(String species, String name, char symbol, int x, int y, int size, int hungerLevel,
			int thirstLevel) {
		super("Platypus", name, 'P', x, y, size, hungerLevel, thirstLevel);

	}
	/**
	 * {@inheritDoc} inherited from Carnivore,define the aggressive behavior
	 * can eatMeat
	 * <p>The method allows the instance to be overridden,providing it it eligible
	 * 
	 */
	@Override
	public void isEatingMeat() {

	}

}
