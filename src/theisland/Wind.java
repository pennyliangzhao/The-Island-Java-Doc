package theisland;
/**
 * Wind class that shows the Wind implements Weather interface.
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class Wind implements Weather {
	/**
	 * field for Wind
	 * 
	 * @param type of wind
	 * @param intensity of wind
	 */
	private String Type;
	private int Intensity;
/**
 * Constructor for Wind
 * @param type wind type
 * @param intensity wind intensity
 */
	public Wind(String type, int intensity) {

		Type = type;
		Intensity = intensity;
	}
	/**
	 * Return type of wind
	 * 
	 * @return type of wind
	 */
	public String getType() {
		return Type;
	}
	/**
	 * Set the type of wind
	 * 
	 * @param type of wind
	 */
	public void setType(String type) {
		Type = type;
	}
	/**
	 * Return the intensity of wind
	 * 
	 * @return the intensity of wind
	 */
	public int getIntensity() {
		return Intensity;
	}
	/**
	 * Set intensity of wind
	 * 
	 * @param intensity of wind
	 */
	public void setIntensity(int intensity) {
		Intensity = intensity;
	}

}
