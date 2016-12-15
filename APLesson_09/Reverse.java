import java.util.Scanner;
public class Reverse
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		String []  names = new String [10];
		System.out.println("What are your 10 names; ");
		
		for (int i = 0; i < names.length; i++)
		{
			names[i] = kb.next();
		}
		for (String name : names)
			{
				System.out.print("\"" + name + "\",");
			}		
			System.out.println("Reversed");
			reverseMethod(names);
	}
	public static void reverseMethod(String []names)
	{
		for(int i = names.length-1; i>=0; i--)
		{
			System.out.print("\"" + (names[i]) +"\",");
		}
		
	}
	
}