package cs145.onlineShopping;

public class ClothingItem extends CatalogItem
{
	private String size;
	
	public ClothingItem (String catNum, String desc, double cost)
	{
		super(catNum, desc, cost);
		size = "";
	}
	
	public String getSize()
	{
		return size;
	}
	
	public void setSize(String size)
	{
		this.size = size;
	}
	
	public String toString()
	{
		return super.toString() + "\t" + size;
	}
}	