import java.util.Scanner;
public class GunGame
{
	static int Clipsize = 16;
	static int shotCount;
	static int bulletCount;
	static String [] Clip;
	
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		Clip = new String[Clipsize];
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("\nAction: ");
			String action = kb.next();
			
			if(action.equals("R"))
			{
				reload();
			}
			if(action.equals("S"))
			{
				System.out.print(shoot());
			}
			printClip();
		}
		System.out.println("youre out of bullets");
	}
	public static void resetClip()
	{
		for(int i = 0; i < Clip.length; i++)
			Clip[i] = "[]";
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			Clip[shotCount - 1] = "[]";
			shotCount = shotCount - 1;
			return "Boom!";
		}
		else
			return "Reload!";
	}
	public static void reload()
	{
		if(bulletCount >= Clipsize)
		{
			bulletCount = bulletCount - Clipsize;
			shotCount = Clipsize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			Clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "";
		output += "Bullets:\t" + bulletCount + "\nClip:\t";
		
		for(int i = 0; i < Clipsize; i++)
		{
			output += Clip[i];
		}
		System.out.print(output);
	}
}