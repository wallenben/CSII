/**
 * MailingAddress represents a standard mailing address consisting of a street address,
 * a city, a state, and a zip code.
 */
package cs145.onlineShopping;

/**
 * @author Diane Christie
 * @version 2020.26.2
 */
public class MailingAddress {

	private String address;
	private String city;
	private String state;
	private String zip;
	
	/**
	 * Creates a mailing address with an address, city, state, and zipcode
	 * @param address The street address
	 * @param city The city
	 * @param state The state
	 * @param zip The zip code
	 */
	public MailingAddress (String address, String city, String state, String zip)
	{
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	/**
	 * Returns the mailing address formatted for a mailing label
	 * @return
	 */
	@Override
	public String toString()
	{
		return address + "\n" + city + ", " + state + " " + zip;
	}
}
