import java.util.Scanner;
public class ReverseDigits
{
	static int number;
	static int rev=0;
	static int num;
	
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your number?");
		number = kb.nextInt();
		returnNum();
		System.out.println(number+" reversed is "+rev);
	}
	public static void returnNum()
	{
		while (num>0)
		{
			rev=rev*10+num%10;
			num/=10;
			
		}
	}
}