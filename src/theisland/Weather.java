package theisland;
/**
 * Interface for classes that represent Weather's common features.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public interface Weather {
	/**
	 * return object depends on the weather's type.
	 * @return object depends on the weather's type.
	 */
	public String getType();

	/**
	 * Return object depends on the weather's intensity.
	 * @return object depends on the weather's intensity.
	 */

	public int getIntensity();
}
