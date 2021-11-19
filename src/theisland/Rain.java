package theisland;
/**
 * shows the Rain class implement Weather interface.
 * Parameters are
 * Type-Rain's weather type
 * Intensity-Intensity of Rain
 
 * @author Liang Zhao
 * @version 1.0
 *
 */
public class Rain implements Weather {
	private String Type;
	private int Intensity;
/**
 * Constructor for Rain
 * 
 * @param type of rain
 * @param intensity of rain
 */
	public Rain(String type, int intensity) {

		Type = type;
		Intensity = intensity;
	}
	/**
	 * Return type of rain
	 * 
	 * @return type of rain
	 */
	public String getType() {
		return Type;
	}

	/**
	 * Set the type of rain
	 * 
	 * @param type of rain
	 */
	public void setType(String type) {
		Type = type;
	}
	/**
	 * Return the intensity of rain
	 * 
	 * @return the intensity of rain
	 */
	public int getIntensity() {
		return Intensity;
	}
	/**
	 * Set intensity of rain
	 * 
	 * @param intensity of rain
	 */
	public void setIntensity(int intensity) {
		Intensity = intensity;
	}

}
