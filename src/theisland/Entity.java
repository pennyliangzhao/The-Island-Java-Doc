package theisland;
/**
 * Interface for classes that represent the common methods.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public interface Entity {
	/**
	 * @return get object depends on position and direction.
	 */
	public char getSymbol();

	/**
	 * Return the position X of the Entity
	 * 
	 * @return get position X of the Entity
	 */
	public int getX();

	/**
	 * Return the position Y of the Entity
	 * 
	 * @return get position Y of the Entity
	 */

	public int getY();

/**
 * Return the size of the Entity
 * @return the size of the Entity
 */

	public int getSize();

}
