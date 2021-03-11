/**
 * 
 */
package cs145.banking;

/**
 * Mailing Address class for the bank account project.
 * 
 * @author Ben
 *
 */
public class MailingAddress {
	private String address;
	private String city;
	private String state;
	private String zip;

	/**
	 * @param address is the address param
	 * @param city    is the city param
	 * @param state   is the state param
	 * @param zip     is the zip param
	 */
	public MailingAddress(String address, String city, String state, String zip) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	/**
	 * toString method
	 */
	public String toString() {
		return address + "\n" + city + ", " + state + " " + zip;
	}
}
