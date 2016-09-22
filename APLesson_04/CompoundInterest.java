import java.util.Scanner;
public class CompoundInterest
{
	public static void main (String [] args)
	{
		Scanner kb = new Scanner(System.in);
		CompoundInterest rate = new CompoundInterest();
		System.out.println("What is your interest rate (in decimal points)?");
		double interest = kb.nextDouble();
		System.out.println("What is the principal amount in dollars?");
		double principal = kb.nextDouble();
		System.out.println("How many times is the loan compounded per year?");
		double number = kb.nextDouble();
		System.out.println("How long will this loan last in years?");
		double time = kb.nextDouble();
		
		rate.calculator(interest,principal,number,time);
		
	}
	
	public void calculator (double interest, double principal, double number, double time) 
	{
		double total = principal*Math.pow((1+(interest/number)),number*time);
		System.out.printf("Your total loan amount including interest will be: $%20.2f", total);

	}
	
}