import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Expressions
{
	public static void main(String[]args)
	{
		Scanner ub = new Scanner(System.in);
		System.out.println("Enter expression: ");
		String expression = ub.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		System.out.println(doEquation(equation));
	}
	public static ArrayList<String> doEquation(ArrayList <String> equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(i < equation.size() && (equation.get(i).equals("*") || equation.get(i).equals("/")))
			{
				if(equation.get(i).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))*Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))/Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				
				equation.remove(i);
			}
			else
				i++;
		}
		int u = 0;
		while(u < equation.size())
		{
			if(u < equation.size() && (equation.get(u).equals("+") || equation.get(u).equals("-")))
			{
				if(equation.get(u).equals("+"))
				{
					equation.set(u,"" + (Integer.parseInt(equation.get(u-1))+Integer.parseInt(equation.get(u+1))));
				}
				else
				{
					equation.set(u,""+(Integer.parseInt(equation.get(u-1))-Integer.parseInt(equation.get(u+1))));
				}
				equation.remove(u-1);
				
				equation.remove(u);
			}
			else
				u++;
		}
		return equation;
	}
}