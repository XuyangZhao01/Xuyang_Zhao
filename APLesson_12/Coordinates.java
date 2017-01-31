import java.util.Scanner;
public class Coordinates
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first x");
		
		int x1 = kb.nextInt();
		System.out.println("Enter your first y");
		
		int y1 = kb.nextInt();
		System.out.println("Enter your second x");
		
		int x2 = kb.nextInt();
		System.out.println("Enter your second y");
		
		int y2 = kb.nextInt();
		
		DistancePoints  = new Distance(x1, y1, x2, y2);
		
		System.out.println("The distance from (" + object.getx1() + ", " + object.gety1() + ") to (" + object.getx2() + ", " + object.gety2() + ") is " + object.getDist());
		
		object.setCoordinates(3, 4, 5, 6);
		
		System.out.println("The distance from (" + object.getx1() + ", " + object.gety1() + ") to (" + object.getx2() + ", " + object.gety2() + ") is " + object.getDist());
		
	}
}