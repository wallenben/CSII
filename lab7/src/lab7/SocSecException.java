package lab7;

public class SocSecException extends Exception {
	public SocSecException(String error) {
		super("Invalid social security number" + error);
	}
}
