import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("What is your first number?");
		num1 = kb.nextDouble();
		System.out.println("What is your second number?");
		num2 = kb.nextDouble();
		System.out.println("What is your third number?");
		num3 = kb.nextDouble();

		print();
	}
	public static double avg()
	{
		return (num1+num2+num3)/3;
	}
	
	public static void print()
	{
		System.out.printf("Your average is %.5f", avg());
	}
}