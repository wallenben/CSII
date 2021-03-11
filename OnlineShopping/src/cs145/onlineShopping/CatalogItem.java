package cs145.onlineShopping;

import java.text.DecimalFormat;

public class CatalogItem {
	private String catalogNumber;
	private String description;
	private double price;

	public CatalogItem(String catNum, String desc, double cost) {
		catalogNumber = catNum;
		description = desc;
		price = cost;
	}

	public String getCatalogNumber() {
		return catalogNumber;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		DecimalFormat money = new DecimalFormat("$0.00");
		return catalogNumber + "\t" + description + "\t" + money.format(price);
	}

}