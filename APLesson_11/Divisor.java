
import java.util.Scanner;

public class Divisor
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int[][]numbers = new int [4][4];
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				numbers[i][j] = (int)(Math.random() * 100) + 1;
				
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Please enter a number:");
		
		int divisor = kb.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				if(numbers[i][j]%divisor == 0)
				{
					count += 1;
				}
			}
		}
		System.out.println("there are " + count + " numbers divisible by " + divisor + " in array.");
	}
}