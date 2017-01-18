import java.util.Scanner;
public class BiggestNumber
{	
	static int [] numbers = new int [10];
	public static void main (String[]args)
	{
		fillArray();
		System.out.println("For the numbers...");
		printArray();
		System.out.println();
		System.out.println("The biggest is..." + getBiggest());		
	}
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		numbers[i] = (int)(Math.random()*100)+1;
	}
	public static void printArray()
	{
		for (int num: numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static int getBiggest()
	{
		int max = 0;
		for ( int num : numbers)
		{
			if (num >= max)
			{
				max = num;
			}
		}
		return max;
	}
}