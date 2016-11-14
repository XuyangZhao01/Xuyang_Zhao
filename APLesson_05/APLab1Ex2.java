import java.util.Scanner;

public class APLab1Ex2

{
		public static void main(String[]args)
		{
			
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
			
			System.out.println("Please enter item 4");
			String item4 = kb.nextLine();
			System.out.println("Please enter price");
			double price4 = kb.nextDouble();
			kb.nextLine();
			
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<receipt>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			format(item1,price1);
			format(item2,price2);
			format(item3,price3);
			format(item4,price4);
			
			
			double subtotal = price1+price2+price3+price4;
			double tax = (price1+price2+price3+price4)*0.08;
			double discount = calcDisc (subtotal);
			double total = tax + subtotal - discount;
			
			format("Subtotal:", subtotal);
			format("Total:", total);
			System.out.println("\n__________________________________________________________________\n           Thank you for your business! \nA 20 percent discount is applied on orders $2000 and over!");
		
		}
		public static double calcDisc(double sub)
		{
			if (sub>= 2000)
				return sub *0.15;
			return 0.0;
		}
		
		public static void format (String word, double number)
		{
			System.out.printf("\n%10s ..........   %10.2f", word, number);
		}
		
		
} 