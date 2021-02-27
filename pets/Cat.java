/**
Represents a Cat that has a name and a breed
@authorname Diane Christie
@date  February 10, 2002
*/
public class Cat implements PetOutput
{

	private String name;
	private String breed;

	/**
	Creates a cat
	@param aName   the pet name
	@param aBreed  the breed of cat
	*/
	public Cat (String aName, String aBreed)
	{
		name = aName;
		breed = aBreed;
	}

	/**
	Returns a string describing the cat
	@return  the cat name and breed
	*/
	public String toString()
	{
		return "It's " + name + " the " + breed;
	}

	/**
		Prints the pet sound to the console window
	*/
	public void sound()
	{
		System.out.println("Meow  Meow");

	}
}