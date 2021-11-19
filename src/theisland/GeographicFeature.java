package theisland;
/**
 * Super class for all GeographicFeatures that sets their common attributes and methods
 * common to them
 * Parameters are
 * name-GeographicFeatures name
 * symbol-character symbol to appear on output
 * x,y-position on the island
 * width-width of GeographicFeatures
 * height-height of of GeographicFeatures
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class GeographicFeature implements Entity{
	private String name;
	private char symbol;
	private int x;
	private int y;
	private int size;
	private int width;
	private int height;
/**
 * Constructor for GeographicFeatures
 * @param name  GeographicFeatures's name
 * @param symbol  GeographicFeatures's symbol
 * @param x  GeographicFeatures's x position
 * @param y  GeographicFeatures's y position
 * @param size  GeographicFeatures's size
 * @param width  GeographicFeatures's width
 * @param height  GeographicFeatures's height
 */
	public GeographicFeature(String name, char symbol, int x, int y, int size, int width, int height) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.x = x;
		this.y = y;
		this.size = size;
		this.width = width;
		this.height = height;
	}
	/**
	 * Return name of GeographicFeature
	 * 
	 * @return name of GeographicFeature
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name of GeographicFeature
	 * 
	 * @param name of GeographicFeature
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Return the symbol of GeographicFeature
	 * 
	 * @return the symbol of GeographicFeature
	 */
	public char getSymbol() {
		return symbol;
	}
	/**
	 * Set symbol of GeographicFeature
	 * 
	 * @param symbol of GeographicFeature
	 */
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	/**
	 * Return the position X of the GeographicFeature
	 * 
	 * @return get position X of the GeographicFeature
	 */
	public int getX() {
		return x;
	}
	/**
	 * Set x position of GeographicFeature
	 * 
	 * @param x position of GeographicFeature
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Return the position Y of the GeographicFeature
	 * 
	 * @return get position Y of the GeographicFeature
	 */
	public int getY() {
		return y;
	}

	/**
	 * Set Y position of GeographicFeature
	 * 
	 * @param y Y position of GeographicFeature
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Return the size of GeographicFeature
	 * 
	 * @return the size of GeographicFeature
	 */
	public int getSize() {
		return size;
	}
	/**
	 * Set size of GeographicFeature
	 * 
	 * @param size of GeographicFeature
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * Return the width of GeographicFeature
	 * @return the width of GeographicFeature
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * Set width of GeographicFeature
	 * 
	 * @param width of GeographicFeature
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * Return the height of GeographicFeature
	 * 
	 * @return the height of GeographicFeature
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * Set height of GeographicFeature
	 * 
	 * @param height of GeographicFeature
	 */
	public void setHeight(int height) {
		this.height = height;
	}

}
