package theisland;
/**
 * shows the Sun class implement Weather interface.
 * Parameters are
 * Type-Sun's weather type
 * Intensity-Intensity of Sun
 
 * @author Liang Zhao
 * @version 1.0
 * 
 */
public class Sun implements Weather {
	private String Type;
	private int Intensity;
	/**
	 * Constructor for Sun
	 * 
	 * @param type of sun
	 * @param intensity of sun
	 */
	public Sun(String type, int intensity) {

		Type = type;
		Intensity = intensity;
	}
	/**
	 * Return type of sun
	 * 
	 * @return type of sun
	 */
	public String getType() {
		return Type;
	}
	/**
	 * Set the type of sun
	 * 
	 * @param type of sun
	 */
	public void setType(String type) {
		Type = type;
	}
	/**
	 * Return the intensity of sun
	 * 
	 * @return the intensity of sun
	 */
	public int getIntensity() {
		return Intensity;
	}
	/**
	 * Set intensity of sun
	 * 
	 * @param intensity of sun
	 */
	public void setIntensity(int intensity) {
		Intensity = intensity;
	}

}
