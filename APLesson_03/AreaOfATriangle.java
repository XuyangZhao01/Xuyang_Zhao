import java.util.Scanner; // import Statement

public class AreaOfATriangle
{
	public static void main (String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		
		System.out.println("Hi there! I will calculate the area of a triangle");
		System.out.println("Enter the base of the triange.");
		
		//search for the next integer that the user enters
		double base = keyboard.nextDouble();
		System.out.println("Cool, what is the height of the triangle?");
		double height = keyboard.nextDouble();
		System.out.println("...");
		double Area = 0.5*base*height;
		System.out.println("Your Area is " + Area);
	}	
}

