import java.util.Scanner;
public class FirstLetter
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] Words = new String [5];
		System.out.println("What are the words?");
		
		for (int i=0; i<Words.length;i++)
		{
			Words [i] = kb.next();
		}
		first(Words);
	}
	public static void first(String [] Words)
	{
		for (int i = 0; i< Words.length; i++)
		{
			System.out.println(Words[i].charAt(0));
		}
	}
}