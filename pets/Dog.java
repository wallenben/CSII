/**
Represents a Dog that has a name and a breed
@authorname Diane Christie
@date  February 10, 2002
*/

public class Dog implements PetOutput
{
	private String name;
	private String breed;


	/**
	Creates a dog
	@param aName   the pet name
	*/
	public Dog (String aName)
	{
		name = aName;
		breed = "Unknown";
	}

	/**
	Creates a dog
	@param aName   the pet name
	@param aBreed  the breed of dog
	*/
	public Dog (String aName, String aBreed)
	{
		name = aName;
		breed = aBreed;
	}

	/**
	Returns a string describing the dog
	@return  the dog name and breed
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
		System.out.println("Woof   Woof");
	}
}

