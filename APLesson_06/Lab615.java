import java.util.Scanner;
public class Lab615
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number you would like to count to.");
		int count = kb.nextInt();
		System.out.println("At what interval?");
		int interval = kb.nextInt();
		
		for(int i = 1; i*interval<= count; i++)
		{
			System.out.println(i*interval);
		}
	}
}