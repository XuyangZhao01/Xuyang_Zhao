import java.util.Scanner;
public class Cube
{
	static double l;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the the length for one side of the cube?");
		l = kb.nextDouble();
		print();
		
	}
	
	public static double calcSurf()
	{
		return 6*l*l;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are %.5f in lenght is %.5f", l, calcSurf());
	}
}