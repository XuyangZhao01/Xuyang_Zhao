import java.util.Scanner;

public class ID
{
		public static void main(String[]args)
		{
			ID ID = new ID ();
			
			Scanner kb = new Scanner(System.in);
			
			System.out.println("Enter your first name:");
			String Name1 = kb.nextLine();
			System.out.println("Enter your last name:");
			String Name2 = kb.nextLine();
			
			System.out.println("Enter your title:");
			String title = kb.nextLine();
			System.out.println("Enter your school:");
			String School = kb.nextLine();
			
			System.out.println("School year:");
			String year = kb.nextLine();
			System.out.println("Subject:");
			String subject = kb.nextLine();
			
			System.out.println("**********************");
			ID.format(School,year);
			ID.format(Name1,Name2);
			ID.format(title,subject);
			
			
		}
		
		public void format (String word, String word2)
		{
			System.out.printf("*\n%10s %10s*", word, word2);
		}
		
		
} 