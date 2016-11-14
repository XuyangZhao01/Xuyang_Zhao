import java.util.Scanner;
public class APLab_051
{	
	static String Math;
	static String English;
	static String Science;
	static String Optional;
	static String Elective;
	static String X;
	static String History;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("What is your English grade?");
		English = kb.next();
		System.out.println("What is your Science grade?");
		Science = kb.next();
		System.out.println("What is your Math grade?");
		Math = kb.next();
		System.out.println("What is your Elective grade?");
		Elective = kb.next();
		System.out.println("What is your History Grade?");
		History = kb.next();
		System.out.println("What is your X period grade?");
		X = kb.next();
		System.out.println("What is your optional academic subject grade?");
		Optional = kb.next();
		
		double gPoints = calcPoints (Science)+calcPoints (English)+calcPoints (Math)+calcPoints (Elective)+calcPoints (History)+calcPoints (X)+calcPoints (Optional);
		double GPA = gPoints/7;
		System.out.println("Your GPA is "+ GPA);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
		{
			return 4;
		}
		else if (grade.equals("B"))
		{
			return 3;
		}
		else if(grade.equals("C"))
		{
			return 2;
		}
		else if(grade.equals("D"))
		{
			return 1;
		}
		else 
		{
			return 0;
		}

	}
}