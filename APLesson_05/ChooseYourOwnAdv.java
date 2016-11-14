import java.util.Scanner;
public class ChooseYourOwnAdv
{	

	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You wake up in an empty space station and you find the alarm system ringing. You see a fork up ahead in front of you. Do you make a left or right?\nGo left or right?");
		String choice=kb.next();
		{
		if (choice.equals ("left"))
		{
			System.out.println("You see a severed corpse by the airlock. You walk up ahead and see a display reading low oxygen levels. What do you do?\nA. Crank the Oxygen level to normal B.Try to look for somebody else");
			choice=kb.next();
			if (choice.equals ("A"))
			{
				System.out.println("You are an idiot! You pushed the lever way to high! The station fills with excess oxygen levels, and a spark from the monitor ignites the oxygen. The spacecraft explodes.");
			}
			else
			{
				System.out.println("Within minutes you find somebody working on the other side of the spacecraft. You ask them what is going on, but they do not reply. What now? \nA. Walk up and tap his shoulder or B. Ignore him and try to find somebody else");
				choice=kb.next();
				if (choice.equals ("A"))
				{
				System.out.println("As you walk up to him, you see his hands shaking as he reaches towards a screwdriver. He quickly turns around and jams the tip of the screwdriver into your left rib cage. Out of breath, you try to sto him as he repeatedly stabs your torso. You bleed out at last as you see his crazed eyes and foaming mouth.");
				}
				else 
				{
				System.out.println("You walk away from him. After a few steps, you hear loud noises screaming and metal clanking behind you. You run for safety from an unkown assailant. The spacecraft begins creaking, and immediately after the airlock fails and you are thrown into space. You feel your body bubbling. Every single drop of water in your body is shaking, vibrating. You pass out. You are dead.");
				}
			}
		}
		else 
		{
			System.out.println("You see the rest of your crewmates boarding an escape capsule. You rush up ahead and join them. You feel that you are safe, but just then a fire arises on the other side of the station. There is still one more person on board. What do you do? \nA. Let them die or B. Wait for them then close the lock");
			choice=kb.next();
			if (choice.equals ("A"))
			{
				System.out.println("You are a smart man! Screw that guy! You all made it safely off the capsule, but just then your celebration ends when you are told that he was the only person able to pilot the spacecraft. Do you let yourself fly, or do you let a another mate fly? \nA. You Fly B. Somebody else flies");
				choice=kb.next();
				if (choice.equals ("A"))
				{
					System.out.println("All of you lived because of your incredibly flying abilities");
				}

				else
				{
					System.out.println("The guy didn't know how to fly and you are all dead");
				}
				
			}
			else 
			{
				System.out.println("The door shuts just as the flames begin to reach the cabin. You are all hyped that he was able to make it. You are now on your way back to earth, and just as you are entering the atmosphere you discover that there is a cracked window to your left. What now? \nA. Cover the window with your body B. Let somebody else take care of it");
				choice=kb.next();
				if (choice.equals ("A"))
				{
					System.out.println("You put your back against the window in hopes of blocking the leak. The spaceship finally lands after an eternity. You are severely burned, but glad you have survived this whole incident.");
				}
				else
				{
					System.out.println("Oh no. You have left the task to the wrong person. He accidentally put too much weight against it, and the window broke! Everybody suffocates.");
				}
				
			}
			
			
		}
		}
	}
}