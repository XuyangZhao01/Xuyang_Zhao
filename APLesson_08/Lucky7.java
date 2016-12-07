import java.util.Scanner;
public class Lucky7
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("type number");
		int number = kb.nextInt();
		System.out.println("There is " +luck(number)+" seven in your number");
	}
	public static int luck(int number)
	{
		if (number>0)
		{
			if(number % 10 == 7)
			{
				return 1 + luck(number/10);
			}
			else
			{
				return luck(number/10);
			}
		}
		else 
		{
			return 0;
		}
	}
}