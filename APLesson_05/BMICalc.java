import java.util.Scanner;
public class BMICalc

{	static double weight;
	static double height;
	static double BMI;
	public static void main(String[]args)
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
		calcCondish(BMI);
		System.out.println("Your condition is "+ calcCondish(BMI));
	}
	public static String calcCondish (double BMI)
	{
		if (BMI<18.5)
		{
			return "Underweight";
		}
		else if (BMI>18.5 && BMI<24.9)
		{
			return "Normal";
		}
		else if (BMI>25 && BMI<29.9)
		{
			return "Overweight";
		}
		else if (BMI>29.9 && BMI<34.9)
		{
			return "Obese";
		}
		else if (BMI>35 && BMI<39.9)
		{
			return "Very Obese";
		}
		else 
		{
			return "Morbidly Obese";
		}
	}
	
}