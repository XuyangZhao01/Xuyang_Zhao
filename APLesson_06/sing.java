import java.util.Scanner;
public class sing
{
	public static void main(String[]args)
	{
			sing("na", 4);
			sing("na", 4);
			sing("hey", 3);
			sing("Goodbye", 1);
		
	}
	public static double sing(String word, int num)
		{	
			for(int i = 1; i <= num; i++)
			{
				System.out.print(word+ " ");
			}
			System.out.println("\n");
			return(6);
			
		}
}