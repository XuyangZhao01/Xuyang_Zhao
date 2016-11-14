import java.util.Random;
import java.util.Scanner;

public class Lesson_05
{
	public static void main (String[]args)
	{
		int num =5;
		if (num ==3)
		{
			System.out.println("num equals 3!");
			
		}
		if (num ==5)
		{
			System.out.println("num equals 5!");
			
		}
		int num1 = 1 +(int)((Math.random()*6));
		System.out.println(num1);
		
		Random number = new Random();
		int number1 = number.nextInt(101) +1;
		System.out.println(number1);
		
		Scanner kb  = new Scanner (System.in);
	}
}