package lab7;

import java.util.Scanner;

public class SocSecProcessor {
	String name;
	String ssn;

	public void main(String args[]) {
		System.out.println("Name?	");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		System.out.println("SSN?	");
		ssn = input.nextLine();
	}

	public static boolean isValid(String ssn) {
		return true;
	}
}
