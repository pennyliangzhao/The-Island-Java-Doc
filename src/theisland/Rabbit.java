package theisland;

/**
 * 
 * Rabbit class that shows the Rabbits' attributes child class of Mammal and
 * implements Herbivore and Food interfaces.
 * 
 * @author liangzhao
 * @version 1.0
 *
 */

public class Rabbit extends Mammal implements Herbivore, Food {
	/**
	 * Constructor for Mammals 
	 * For invocation by subclass constructors, typically implicit.
	 * 
	 * @param name   Rabbit's name
	 * @param symbol Rabbit's symbol
	 * @param x  Rabbit's x position
	 * @param y  Rabbit's position
	 * @param size  Rabbit's size
	 * @param hungerLevel  Rabbit's hungerLevel
	 * @param thirstLevel  Rabbit's thirstLevel
	 * @param speed  Rabbit's speed
	 * @param isFemale  if Rabbit is female
	 */

	public Rabbit(String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel, int speed,
			boolean isFemale) {
		super("Rabbit", name, symbol, x, y, size, hungerLevel, thirstLevel, speed, isFemale);

	}
	/**
	 * {@inheritDoc} inherited from Herbivore,define the aggressive behavior
	 * eats grass
	 * <p>The method allows the instance to be overridden,providing it it eligible
	 * 
	 */
	@Override
	public void isEatingGrass() {

	}

}
