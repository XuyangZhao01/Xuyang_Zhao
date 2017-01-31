import java.util.Scanner;

public class mph0
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter distance");
		int distance = kb.nextInt();
		System.out.println("Enter hours");
		int hours = kb.nextInt();
		System.out.println("Enter minutes");
		int minutes = kb.nextInt();
		
		MPH object = new MPH(distance, hours, minutes);
		
		System.out.println(object.getDis() + " miles in " + object.getHours() + " hours = " + object.getmph() + " MPH");
		
	}
}