import java.util.Scanner;
public class Lab62
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a number: ");
		int num = kb.nextInt();
		int f = 1;
		
		for(int i = 1; i<= num; i++)
		{
			f *= i;	
		}
		System.out.println(f);
		
	}
}