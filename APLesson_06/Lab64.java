import java.util.Scanner;
public class Lab64
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is the integer");
		int integer = kb.nextInt();
		System.out.println("how many rows?");
		int num = kb.nextInt();
		
		for(int i = 1; i<= num; i++)
		{
			
			System.out.println(i + "|"  + i*num);
		}
		
	}
}