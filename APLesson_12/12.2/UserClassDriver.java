import java.util.Scanner;
public class UserClassDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter first name");
		String first = kb.next();
		
		System.out.println("Enter last name");
		String last = kb.next();
		
		System.out.println("Would you want a public avatar?");
		
		String choice = kb.next();
		
		if(choice.equals("n"))
		{ 
			User p1 = new User(first, last);
			System.out.println(p1);
		}
		if(choice.equals("y"))
		{
			System.out.println("Enter your avatar name");
			String avatar = kb.next();
			
			User p2 = new User(first, last, avatar);
			System.out.println(p2);
		}
	}
}