import java.util.Scanner;
public class Subwoofers
{
	public static void main (String [] args)
	{
		Scanner kb = new Scanner(System.in);
		Subwoofers dimension = new Subwoofers();
		System.out.println("What is the height in inches?");
		double number1 = kb.nextDouble();
		System.out.println("What is the length in inches?");
		double number2 = kb.nextDouble();
		System.out.println("What is the width in inches?");
		double number3 = kb.nextDouble();
	
		dimension.calcVol(number1,number2,number3);
		
	}
	
	public void calcVol (double number1, double number2, double number3)
	{
		double total = (number1*number2*number3)/1728;
		System.out.printf("Your volume in cubic feet is %20.2f", total);

	}
	
}