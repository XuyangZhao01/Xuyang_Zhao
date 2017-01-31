import java.util.Scanner;
public class InventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Item manufacturer");
		String manu = kb.next();
		System.out.println("Item name");
		String na = kb.next();
		
		System.out.println("Do you have category and price?");
		String choice = kb.next();
		if(choice.equals("n"))
		{
			Inventory object = new Inventory(manu, na);
			System.out.println(object);
		}
		if(choice.equals("y"))
		{
			System.out.println("Enter a category:");
			String cat = kb.next();
			
			System.out.println("Enter a price:");
			int pric = kb.nextInt();
			
			Inventory object1 = new Inventory(manu, na, cat, pric);
			System.out.println(object1);
		}
	}
}