import java.util.Scanner;

public class XO
{
	public static void main(String[]args)
	{
		String[][]XO = new String [4][4];
		for(int i = 0; i < XO.length; i++)
		{
			for(int j = 0; j < XO[i].length; j++)
			{
				int pick = (int)(Math.random() * 2) + 1;
				
				if(pick == 1)
				{	
					XO[i][j] = "X";
				}
				if(pick == 2)
				{
					XO[i][j] = "O";
				}
				
				System.out.print(XO[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
}