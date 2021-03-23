package lab7p2;
/**
 * Class for making a social security exception.
 * 
 * @author Ben Wallen
 * @version 2021.03.23
 */
public class SocSecException extends Exception {
	public SocSecException(String error) {
		super("Invalid social security number, " + error);
	}
}
