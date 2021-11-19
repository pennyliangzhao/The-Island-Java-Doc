package theisland;

/**
 * 
 * Worm class that shows the worm's attributes child class of Insect and
 * implements Food interface.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Worm extends Insect implements Parasite, Food {
/**
 * 
 * @param species worm's species
 * @param name worm's name
 * @param symbol worm's  symbol
 * @param x worm's x position
 * @param y worm's position
 * @param size worm's size
 * @param hungerLevel worm's hungerLevel
 * @param thirstLevel worm's thirstLevel
 */
	public Worm(String species, String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel) {
		super("Worm", name, 'W', x, y, size, hungerLevel, thirstLevel, false);

	}
	/**
	 * {@inheritDoc} inherited from Parasite,define the aggressive behavior
	 * can eat other animals
	 * <p>The method allows the instance to be overridden,providing it it eligible
	 * 
	 */
	@Override
	public void eat() {

	}

	/**
	 * {@inheritDoc} inherited from Parasite,define the aggressive behavior
	 * can move
	 * <p>The method allows the instance to be overridden,providing it it eligible
	 * 
	 */
	@Override
	public void move() {

	}

}
