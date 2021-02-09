package cs145.examples.rps;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		int computer;
		int user = 0;
		int verify;
		Scanner keyboardIn = new Scanner(System.in);
		while (user != 4) {

			Random generator = new Random();
			computer = generator.nextInt(3);

			System.out.println("Welcome to Rock-Paper-Scissors.");
			System.out.println("Please enter the number of your selection");
			System.out.println("1.  Rock");
			System.out.println("2.  Paper");
			System.out.println("3.  Scissors");
			System.out.println("4.  Quit");
			System.out.println();

			// getting the user selection

			user = keyboardIn.nextInt();
			System.out.println("You chose option " + user + ", type 1 to confirm or 2 to re-enter your input.");
			verify = keyboardIn.nextInt();
			if (verify == 2) {
				System.out.println("Please enter the number of your selection");
				System.out.println("1.  Rock");
				System.out.println("2.  Paper");
				System.out.println("3.  Scissors");
				System.out.println("4.  Quit");
				System.out.println();
				user = keyboardIn.nextInt();
			}
			//because the list starts at 1 with var computer, we subtract here for consistency
			user--;
			//return statement if the user quits the loop
			if (user == 3) {
				return;
			}
			// tell the player what was chosen
			if (user == 0)// player is rock
			{
				System.out.println("Player is rock");
			} else if (user == 1)// player is paper
			{
				System.out.println("Player is paper");
			} else // player is scissors
			{
				System.out.println("Player is scissors");
			}
			// tell the player what the computer has chosen
			if (computer == 0)// computer is rock
			{
				System.out.println("Computer is rock");
			} else if (computer == 1)// computer is paper
			{
				System.out.println("Computer is paper");
			} else // computer is scissors
			{
				System.out.println("Computer is scissors");
			}

			// determine winner
			if (user == computer) // tie
			{
				System.out.println("It is a tie");
			} else if (user < computer) // player is rock
			{
				//specific cases that the equation doesn't cover need a new statement
				if ((user == 0) & (computer == 2)) {
					System.out.println("Player wins");
				} else {
					System.out.println("Computer wins");
				}
			} else // computer is scissors
			{
				if ((user == 2) & (computer == 0)) {
					System.out.println("Computer wins");
				} else {
					System.out.println("Player wins");
				}
			}
		}
		keyboardIn.close();
	}
}