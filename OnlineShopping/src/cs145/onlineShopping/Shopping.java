package cs145.onlineShopping;

import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		Customer guest;
		ArrayList<CatalogItem> catalog;
		String catNumber;
		String desc;
		double price;
		int choice;

		Scanner in = new Scanner(new File("LLBean.txt"));

		guest = new Customer();
		catalog = new ArrayList<CatalogItem>();

		while (in.hasNext()) {
			String line = in.nextLine();

			StringTokenizer strTokenizer = new StringTokenizer(line, ",");
			catNumber = strTokenizer.nextToken();
			desc = strTokenizer.nextToken();
			price = Double.parseDouble(strTokenizer.nextToken());

			if (catNumber.charAt(0) == 'C')
				catalog.add(new ClothingItem(catNumber, desc, price));
			else
				catalog.add(new CatalogItem(catNumber, desc, price));
		}

		in.close();

		do {
			choice = printMenu();
			switch (choice) {
			case 1:
				guest.signIn();
				break;
			case 2:
				order(catalog, guest);
				break;
			case 3:
				System.out.println();
				System.out.println(guest.toString());
			case 4:
				find(catalog);
				break;
			case 5:
				printAll(catalog);
				break;
			case 6:

			}
		} while (choice != 6);
		keyboard.close();
	}// end of main

	public static int printMenu() {
		System.out.println();
		System.out.println("Welcome to Online Shopping");
		System.out.println("You must sign in before ordering.");
		System.out.println("Select the menu item by entering the number.");
		System.out.println("1.  Sign in to enter customer information");
		System.out.println("2.  Add an item to a customers shopping cart");
		System.out.println("3.  Print the customers order");
		System.out.println("4.  Find an item");
		System.out.println("5.  List all items");
		System.out.println("6.  Exit");
		System.out.print("Enter your choice:  ");
		int choice = Integer.parseInt(keyboard.nextLine());
		return choice;
	}// end printMenu

	public static void find(ArrayList<CatalogItem> catalog) {
		System.out.print("Enter a word that you would like to search for:  ");
		String word = keyboard.nextLine();
		boolean notFound = true;
		for (int i = 0; i < catalog.size(); i++) {
			if (catalog.get(i).getDescription().indexOf(word.toUpperCase()) != -1)
				;
			{
				if (notFound) {
					System.out.println("Item\tDescription\t\tPrice");
				}
				System.out.println(catalog.get(i).toString());
				notFound = false;
			}
		}

		if (notFound)
			System.out.println("There are no items that match that description");
	}// end find

	public static void printAll(ArrayList<CatalogItem> catalog) {
		System.out.println("Item\tDescription\t\tPrice");
		for (int i = 0; i < catalog.size(); i++)
			System.out.println(catalog.get(i).toString());
	}// end printAll

	public static void order(ArrayList<CatalogItem> catalog, Customer guest) {
		boolean notFound = true;
		System.out.print("Enter the catalog number of the item to order:  ");
		String item = keyboard.nextLine();

		for (int i = 0; i < catalog.size(); i++) {
			if (catalog.get(i).getCatalogNumber().equalsIgnoreCase(item)) {
				guest.addToShoppingCart(catalog.get(i));
				notFound = false;
			}
		}
		if (notFound) {
			System.out.println("I am sorry, that catalog number is not on file.");
			System.out.println("Try searching for an item, or listing all items, to get the correct catalog number.");
		}
	}
}
