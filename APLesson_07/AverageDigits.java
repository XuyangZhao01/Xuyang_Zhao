import java.util.Scanner;
public class AverageDigits
{
	static int number;
	static int digits = 0;
	static double average = 0;
	static int num;
	static int sum;
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number ");
		number=kb.nextInt();
		num=number;
		avDigits();
		
	}
	public static void avDigits()
	{
	
		while (num>0)
		{
			digits += 1;
			average += (num %10);
			num= num/10;	
			
		}
		average/=digits;
		System.out.println("the average of  " +number +" is " + average);
	
	}
}