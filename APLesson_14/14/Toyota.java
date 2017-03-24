import java.util.Arrays;
public class Toyota implements Location
{
	private String Loc;
	
	public Toyota()
	{
		Loc = "";
	}
	
	public Toyota(String L)
	{
		Loc = L;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(String L)
	{
		Loc = L;
	}
	
	public double[] getLoc()
	{
		double[] Location = new double[2];
		String[] loca = Loc.split(", ");
		Location[0] = Double.parseDouble(loca[0]);
		Location[1] = Double.parseDouble(loca[1]);
		return Location;
	}
}