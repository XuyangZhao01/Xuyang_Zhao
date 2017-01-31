public class Inventory
{
	private String manufacturer, name, category;
	private int UPC, price;
	
	public Inventory(String manu, String na)
	{
		manufacturer = manu;
		name = na;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	
	public Inventory(String manu, String na, String categ, int pri)
	{
		manufacturer = manu;
		name = na;
		category = categ;
		price = pri;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	
	public String toString()
	{
		return "Inventory Item...\nItem Manufacturer: " + manufacturer +"\nItem Name: " + name + "\nItem Category: " + category +"\nItem Price: " + price + "\nUPC: " + UPC;
	}
}