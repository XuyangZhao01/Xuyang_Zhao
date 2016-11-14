import java.util.Scanner;
public class Password
{
	static String password;
	static String username;
	static String user;
	static String pass;
	public static void main (String[]args)
	{
		password= "password";
		username= "username";
		passcheck();
	}
	public static void passcheck()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Username followed by Password");
		user=kb.next();
		pass=kb.next();
		if (user.equals (username)&& pass.equals(password))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(user.equals (username) && pass != (password))
			{
				System.out.println("Your pass is incorrect");
				passcheck();
			}
			else if (pass.equals (password) && user != (username))
			{
				System.out.println("Your user is incorrect");
				passcheck();
			}
			else
			{
				System.out.println("Both are incorrect");
				passcheck();
			}
		}
	}
}