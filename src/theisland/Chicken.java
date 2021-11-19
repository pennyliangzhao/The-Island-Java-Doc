package theisland;
/**
 * shows the Chicken's attributes child class of Bird and implements Herbivore and Food interfaces.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class Chicken extends Bird implements Herbivore, Food {
	/**
	 * Constructor for Bird 
     * For invocation by subclass constructors, typically implicit.
     * 
	 * @param species   chicken's species
	 * @param name   chicken's name
	 * @param symbol   chicken's symbol
	 * @param x   chicken's x
	 * @param y   chicken's y
	 * @param size   chicken's size
	 * @param hungerLevel   chicken's hungerLevel
	 * @param thirstLevel   chicken's thirstLevel
	 * @param canFly   if chicken can fly
	 */

	public Chicken(String species, String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel,
			Boolean canFly) {
		super("Chicken", name, symbol, x, y, size, hungerLevel, thirstLevel, canFly);

	}
	/**
	* {@inheritDoc} inherited from Herbivore,define the aggressive behavior
	* eat grass
	* 
	* <p>The method allows the instance to be overridden,providing it it eligible
	*/

	@Override
	public void isEatingGrass() {

	}

}
