package theisland;

/**
 * shows the Grub's attributes child class of Insect and implements Food interface.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Grub extends Insect implements Food {
/**
 * Constructor for Insect
 * For invocation by subclass constructors, typically implicit.
 * @param species grub's species
 * @param name grub's  name
 * @param symbol grub's symbol
 * @param x  grub's x position
 * @param y  grub's y position
 * @param size  grub's size
 * @param hungerLevel  grub's hungerLevel
 * @param thirstLevel  grub's thirstLevel
 */
	public Grub(String species, String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel) {
		super("Grub", name, 'g', x, y, size, hungerLevel, thirstLevel, false);

	}

}