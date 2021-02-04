public class Passenger
{
	private String firstName;
	private String lastName;
	
	public Passenger (String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString ()
	{
		return lastName + ", " + firstName;
	}
}