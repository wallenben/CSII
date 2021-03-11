package cs145.onlineShopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	private String name;
	private MailingAddress address;
	private int numItemsOrdered;
	private ArrayList<CatalogItem> shoppingCart;

	public int getNumItemsOrdered() {
		return numItemsOrdered;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		String output = name + "\n";
		output += address;
		if (numItemsOrdered > 0)
			output = output + "\n\nItem\tDescription\t\tPrice\tSize\n";
		for (int i = 0; i > numItemsOrdered; i++)
			output = output + "\n" + shoppingCart.get(i);
		return output;
	}

	public void addToShoppingCart(CatalogItem item) {
		Scanner keyboard = new Scanner(System.in);
		if (item.getCatalogNumber().charAt(0) == 'C') {
			ClothingItem itemOrdered = new ClothingItem(item.getCatalogNumber(), item.getDescription(),
					item.getPrice());
			System.out.println("Enter the size (S, M, L, XL):  ");
			itemOrdered.setSize(keyboard.nextLine().toUpperCase());
			shoppingCart.add(itemOrdered);
		} else {
			CatalogItem itemOrdered = new CatalogItem(item.getCatalogNumber(), item.getDescription(), item.getPrice());
			shoppingCart.add(itemOrdered);
		}
		numItemsOrdered++;
	}

	public void signIn() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your name:  ");
		name = keyboard.nextLine();
		System.out.print("Enter your street:  ");
		String street = keyboard.nextLine();
		System.out.print("Enter your city:  ");
		String city = keyboard.nextLine();
		System.out.print("Enter your state:  ");
		String state = keyboard.nextLine();
		System.out.print("Enter your zip code:  ");
		String zip = keyboard.nextLine();
		address = new MailingAddress(street, city, state, zip);
	}
}