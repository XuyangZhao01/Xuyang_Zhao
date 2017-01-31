import java.util.Scanner;
public class GameHealth
{
	static String [] health;
	static int healthcount;
	static int HEALTHLOAD = 6;
	
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthcount = 6;
		health = new String[HEALTHLOAD];
		
		while(turn != "Q" && healthcount > 0)
		{
			System.out.println("press enter when ready");
			
			turn = kb.nextLine();
			damage = (int)(Math.random()*2)+1;
			amount = (int)(Math.random()*6)+1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("Youre dead");
	}
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthcount -= amt;
			return "taking " + amt + " damage!";
		}
		else
		{
			if(healthcount + amt < HEALTHLOAD)
			{
				healthcount += amt;
			}
			else
			{
				healthcount = HEALTHLOAD;
			}
		}
		return "Power up " + amt + "!";
	}
	public static void printClip()
	{
		String output = "Health: \t";
		
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthcount)
			{
				health[i] = "@";
			}
			
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}