package lab7p2;

import java.util.Scanner;

/**
 * Class for processing social security number information.
 * 
 * @author Ben Wallen
 * @version 2021.03.23
 */
public class SocSecProcessor {
	/**
	 * Main method, starts program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String ch = "";
		do {
			String name;
			String ssn;
			System.out.print("Name?	");
			Scanner input = new Scanner(System.in);
			name = input.nextLine();
			System.out.print("SSN?	");
			ssn = input.nextLine();
			try {
				isValid(ssn);
				System.out.println(name + "\n" + ssn);
			} catch (SocSecException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Continue?	");
			ch = input.next();
		} while (ch.charAt(0) == 'y');
	}
/**
 * boolean method to check if the SSN is valid
 * @param ssn is the ssn in question
 * @return true if the ssn is valid
 * @throws SocSecException if an error occcurs
 */
	public static boolean isValid(String ssn) throws SocSecException {
		if (ssn.length() != 10) {
			throw new SocSecException("wrong number of characters");
		}
		for (int i = 0; i < 10; i++) {
			if ((ssn.charAt(i) != '-') && (i == 3 || i == 6)) {
				throw new SocSecException("dashes are in the wrong place");
			}
			if ((Character.isLetter(ssn.charAt(i)) == true)) {
				throw new SocSecException("letters exist where there should be numbers.");
			}

		}

		return true;
	}
}