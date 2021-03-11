/**
 * 
 */
package cs145.banking;

/**
 * Person class for the bank account project.
 * @author Ben
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	private MailingAddress address;
	private int pin;

	/**
	 * @param firstName is the firstname of the person
	 * @param lastName is the lastname  of the person
	 * @param address is the address of the person
	 * @param pin is the pin of the person
	 */
	public Person(String firstName, String lastName, MailingAddress address, int pin) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pin = pin;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
/**
 * toString method
 */
	public String toString() {
		return firstName + " " + lastName + "\n" + address.toString();
	}
}
