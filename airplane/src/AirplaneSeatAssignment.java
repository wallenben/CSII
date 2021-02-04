import java.util.Scanner;

public class AirplaneSeatAssignment
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		Passenger [][] seats = new Passenger [3][4];
		char answer;
		char chair;
		
		System.out.println("Welcome to seating assignments");
		do
		{
			System.out.println("Here is the seating arrangement");
		
			System.out.println("-----------------------------------------");
			System.out.println("|         |        |  |        |        |");
			System.out.println("|   1A    |   1B   |  |  1C    |   1D   |");
			System.out.println("|         |        |  |        |        |");
			System.out.println("-----------------------------------------");
			System.out.println("|         |        |  |        |        |");
			System.out.println("|   2A    |   2B   |  |  2C    |   2D   |");
			System.out.println("|         |        |  |        |        |");
			System.out.println("-----------------------------------------");
			System.out.println("|         |        |  |        |        |");
			System.out.println("|   3A    |   3B   |  |  3C    |   3D   |");
			System.out.println("|         |        |  |        |        |");
			System.out.println("-----------------------------------------");
		
			System.out.print("Choose a seat by entering the seat number:  ");
			String input = keyboard.nextLine();		
		
			int row = Integer.parseInt(input.substring(0,1));
			int col= 0;
			chair = input.charAt(1);
			switch (chair)
			{
				case 'A':
				case 'a':
					col = 0;
					break;
				case 'B':
				case 'b':
					col = 1;
					break;
				case 'C':
				case 'c':
					col = 2;
					break;
				case 'D':
				case 'd':
					col = 3;
					break;
				default:
					col = 0;
			}
			
			if (seats[row-1][col] != null)
			{
				System.out.println("Sorry that seat is not available.");
			}
			else
			{
				System.out.print("Passenger First Name:  ");
				String first = keyboard.nextLine();	
				System.out.print("Passenger Last Name:  ");
				String last = keyboard.nextLine();
				
				seats [row-1][col] = new Passenger(first, last);
			}
			
			for(row = 0; row < seats.length; row++)
			{
				for (col = 0; col < seats[row].length; col++)
				{
					switch(col)
					{
						case 0:
							chair = 'A';
							break;
						case 1:
							chair = 'B';
							break;
						case 2:
							chair = 'C';
							break;
						case 3:
							chair = 'D';
							break;
					}	
					System.out.printf("%d%c%s",(row+1),chair,":  ");
					if (seats[row][col] != null)
						System.out.println(seats[row][col].toString());
					else
						System.out.println("available");	
				}
			}
			System.out.println("Do you want to reserve another seat?");
			answer = keyboard.nextLine().charAt(0);
		}while (answer == 'Y' || answer == 'y');
		
		System.out.println("Thank you for your patronage.");
		
		
	}	
}