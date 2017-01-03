import java.util.Scanner;
import java.util.Random;
public class AverageNumbers
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int [] numbers = new int [10];
		System.out.println("Numbers..");
		for (int i = 0; i<numbers.length;i++)
		{
			numbers [i] = (int)(Math.random()*100)+1;
		}
		for (int i = 0; i<numbers.length; i++)
		{
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\n"+"the average of the numbers above is "+ average(numbers));
		
	}
	public static int average(int[] numbers)
	{
		int average = 0;
		
		for(int num : numbers)
		{
			average += num;
		}
		return average/numbers.length;
	}
}