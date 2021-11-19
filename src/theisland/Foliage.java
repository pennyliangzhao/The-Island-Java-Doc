package theisland;

/**
 * Super class for all Foliages that sets their common attributes and methods
 * common to them
 * Parameters are
 * name-foliages name
 * symbol-character symbol to appear on output
 * x,y-position on the island
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Foliage implements Entity {
	private String name;
	private char symbol;
	private int size;
	private int x;
	private int y;

	/**
	 * Constructor for foliages
	 * 
	 * @param name  foliage's name
	 * @param symbol foliage's symbol
	 * @param size foliage's size
	 * @param x  foliage's x position
	 * @param y  foliage's y postion
	 */
	public Foliage(String name, char symbol, int size, int x, int y) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.size = size;
		this.x = x;
		this.y = y;
	}

	/**
	 * Return name of Foliage
	 * 
	 * @return name of foliage
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of Foliage
	 * 
	 * @param name of Foliage
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return the symbol of Foliage
	 * 
	 * @return the symbol of Foliage
	 */
	public char getSymbol() {
		return symbol;
	}

	/**
	 * Set symbol of Foliage
	 * 
	 * @param symbol of Foliage
	 */
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	/**
	 * Return the size of Foliage
	 * 
	 * @return the size of Foliage
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Set size of Foliage
	 * 
	 * @param size of Foliage
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Return the position X of the Foliage
	 * 
	 * @return get position X of the Foliage
	 */

	public int getX() {
		return x;
	}

	/**
	 * Set x position of Foliage
	 * 
	 * @param x position of Foliage
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Return the position Y of the Foliage
	 * 
	 * @return y get position Y of the Foliage
	 */
	public int getY() {
		return y;
	}

	/**
	 * Set Y position of Foliage
	 * 
	 * @param y Y position of Foliage
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * defines the aggressive behavior can grow
	 */
	public void grow() {

	}

	/**
	 * defines the aggressive behavior can produce seed
	 */
	public void seed() {

	}

}
