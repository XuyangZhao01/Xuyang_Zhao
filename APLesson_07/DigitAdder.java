import java.util.Scanner;
public class DigitAdder
{
	static int sum = 0;
	static int num;
	static int number=0;
	public static void main (String[]args)
	{
		Scanner kb= new Scanner (System.in);
		System.out.print("Pick a number");
		number= kb.nextInt();
		num=number;
		sumDigits();
		System.out.println("The sum of  " +num + sum);
	
	}
	public static void sumDigits()
	{
		while(number>0)
		{
			number/=10;
			sum += (num %10);
			num= num/10;
		}
	}
}