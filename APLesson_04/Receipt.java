import java.util.Scanner;

public class Receipt
{
		public static void main(String[]args)
		{
			Receipt Receipt = new Receipt ();
			
			Scanner kb = new Scanner(System.in);
			
			System.out.println("Please enter item 1");
			String item1 = kb.nextLine();
			System.out.println("Please enter price");
			double price1 = kb.nextDouble();
			kb.nextLine();
			
			System.out.println("Please enter item 2");
			String item2 = kb.nextLine();
			System.out.println("Please enter price");
			double price2 = kb.nextDouble();
			kb.nextLine();
			
			System.out.println("Please enter item 3");
			String item3 = kb.nextLine();
			System.out.println("Please enter price");
			double price3 = kb.nextDouble();
			kb.nextLine();
			
			System.out.println("<<<<<<receipt>>>>>>");
			Receipt.format(item1,price1);
			Receipt.format(item2,price2);
			Receipt.format(item3,price3);
			
			
			double subtotal = price1+price2+price3;
			double tax = (price1+price2+price3)*0.08;
			double total = tax + subtotal;
			
			Receipt.format("Subtotal:", subtotal);
	
			Receipt.format("Total:", total);
			
		}
		
		public void format (String word, double number)
		{
			System.out.printf("\n%10s ..........   %10.2f", word, number);
		}
		
		
} 