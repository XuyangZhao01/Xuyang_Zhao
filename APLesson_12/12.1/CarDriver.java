import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter color");
		String paint = kb.nextLine();
		
		System.out.println("Enter interior");
		String interior = kb.nextLine();
		
		System.out.println("Enter engine type");
		String engine = kb.nextLine();
		
		System.out.println("Enter the tire type");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle......\nPaint:\t" + object.getPaint() + "\nInterior:\t" + object.getInterior() + "\nEngine:\t" + object.getEngine() + "\nTires:\t" + object.getTires());
		
	}
}