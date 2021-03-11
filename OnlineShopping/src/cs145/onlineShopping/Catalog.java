package cs145.onlineShopping;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Catalog {
	public static void main(String[] args) throws IOException {
		String catNumber;
		String desc;
		double price;
		int numItems = 0;

		CatalogItem[] catalog = new CatalogItem[25];
		Scanner in = new Scanner(new File("LLBean.txt"));

		while (in.hasNext() && numItems < catalog.length) {
			String line = in.nextLine();
			StringTokenizer strTokenizer = new StringTokenizer(line, ",");

			catNumber = strTokenizer.nextToken();
			desc = strTokenizer.nextToken();
			price = Double.parseDouble(strTokenizer.nextToken());
			catalog[numItems] = new CatalogItem(catNumber, desc, price);

			numItems++;
		}
		System.out.println("Item\tDescription\t\tPrice");
		for (int i = 0; i < numItems; i++) {
			System.out.println(catalog[i]);
		}
	}
}
