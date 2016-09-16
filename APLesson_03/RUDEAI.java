import java.util.Scanner; // import Statement

public class RUDEAI
{
	public static void main (String[]args)
	{
		System.out.println("THIS IS RUDE AI.");
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("What is your name?");
		
		//search for the next integer that the user enters
		String name = keyboard.nextLine();
		System.out.println("WHAT? YOUR NAME IS " + name + "? WHAT A JOKE!");
		
		System.out.println ("Tell me. How old are you?");
		
		int age = keyboard.nextInt();
		System.out.println("YOUR AGE IS " + age + "? What a terrible age! I hope you get to die soon, so the world would not have to deal with such an abomination");
		keyboard.nextLine();
		
		System.out.println("Now. Let me know what you like to do for fun.");
		
		String fun = keyboard.nextLine();
		System.out.println("That sounds so boring that I am falling asleep! I dont even think that it is even possible for me to fall asleep. Why would anyone want to do  "+ fun + " for fun???");
		
		System.out.println("I really want to stop you here , but I am programmed to interview you.\nWhat kind of music do you like?");
		
		String music = keyboard.nextLine();
		
		System.out.println("I must say that you have a horrible taste in music. \nMoving on. How many siblings do you have?");
		
		int siblings = keyboard.nextInt();
		System.out.println("How unimpressive... \nLastly, what do you want to be when you grow up?");
		keyboard.nextLine();
		
		String occupation = keyboard.nextLine();
		System.out.println("Okay im finally done with you. Get out of here.");
		
	
	}
}

