package theisland;

/**
 * 
 * shows the Wolf's attributes child class of Mammal
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class Cat extends Mammal implements Carnivore, Food {
/**
 * 
 * @param name cat's name
 * @param symbol  cat's symbol
 * @param x cat's x position
 * @param y  cat's y position
 * @param size  cat's size
 * @param hungerLevel  cat's hungerLevel
 * @param thirstLevel  cat's thirstLevel
 * @param speed  cat's speed
 * @param isFemale  if cat is female
 */
	public Cat(String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel, int speed,
			boolean isFemale) {
		super("cat", name, symbol, x, y, size, hungerLevel, thirstLevel, speed, isFemale);

	}
/**
 * defines the aggressive behavior 
 * can eat meat
 */
	@Override
	public void isEatingMeat() {

	}
}
