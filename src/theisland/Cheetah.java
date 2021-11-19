package theisland;
/**
 * shows the Cheetah's attributes child class of Mammal 
 * and implement Carnivore interface.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Cheetah extends Mammal implements Carnivore {
/**
 * Constructor for Mammals
 * For invocation by subclass constructors, typically implicit.
 * 
 * @param species  cheetah's species
 * @param name    cheetah's name
 * @param symbol   cheetah's symbol
 * @param x  cheetah's x position
 * @param y  cheetah's y position
 * @param size  cheetah's size
 * @param hungerLevel  cheetah's hungerLevel
 * @param thirstLevel  cheetah's thirstLevel
 * @param speed  cheetah's speed
 * @param isFemale  if cheatah is female
 */
	public Cheetah(String species,String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel,
			int speed, boolean isFemale) {
		super("Cheetah", name, symbol, x, y, size, hungerLevel, thirstLevel, speed, isFemale);

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