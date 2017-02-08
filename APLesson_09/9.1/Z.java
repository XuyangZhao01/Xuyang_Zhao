import java.util.Scanner;
public class Z
{
	static String [] words = new String [5];
	public static void main (String[]args)
	{
		System.out.println("what are your 5 words");
		fillArray();
		printArray();
		System.out.println("only " + hasZs() + " contain(s) the letter z");
	}
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		for (int i=0; i< words.length; i++)
		{
			words[i]= kb.next();
		}
	}
	public static void printArray()
	{
		System.out.println("for the words: ");
		for (String word: words)
		{
			
			System.out.print( word );
			System.out.print( " ");	
		}
		System.out.println();
	}
	public static String hasZs()
	{
		String z= "";
		for (String word:words)
		{
			if (word.indexOf("z")>=0)
			{
				z = z + " " + word;
		
			}
			
		}
		return z;
	}
}