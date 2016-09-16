import java.util.Scanner; // import Statement

public class BMICalculator
{
	public static void main (String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		
		System.out.println("Hi there! I will help you calculate your BMI");
		System.out.println("Enter your weight.");
		
		//search for the next integer that the user enters
		double weight = keyboard.nextDouble();
		System.out.println("Alright. What is your height in inches?");
		double height = keyboard.nextDouble();
		System.out.println("Great. Give me a quick moment.");
		double BMI = (weight)/(height*height)*703;
		System.out.println("Your BMI is " + BMI);
	}	
}

