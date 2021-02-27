/**
Driver program to test various pet classes
that implement the PetOutput interface
@authorname Diane Christie
@since February 10, 2002
*/
public class TestInterface
{
	public static void main (String[] args)
	{
		PetOutput[] thePets = {new Dog("Rover", "German Shepard"),
					new Cat("Max", "Siamese"),
					new Spaniel("Fido")};

		for(int i = 0; i < thePets.length; i++)
		{
			System.out.println("\n" + thePets[i]);
			thePets[i].sound();
			System.out.println();
		}
	}
}
