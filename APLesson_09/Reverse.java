import java.util.Scanner;

public class Reverse
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("5 words:");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("Order ");
		
		for(String word : words)
		{
			System.out.println(word);
		}
		

		System.out.println("Reverse: ");
		
		Reverse(words);
	}
	public static void Reverse(String[] words)
	{
		for(int i = words.length - 1; i >= 0; i--)
		{
			System.out.println(words[i]);
		}
	}
}