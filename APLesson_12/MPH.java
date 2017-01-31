import java.lang.Math.*;
public class MPH
{
	private int disance, hours, minutes;
	
	private double mph;
	
	public MPH()
	{
		disance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MPH(int dis, int hrs, int min)
	{
		disance = dis;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	
	public void setValues(int dis, int hrs, int mins)
	{
		disance = dis;
		hours = hrs;
		minutes = mins;
	}
	
	public int getDis()
	{
		return disance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMins()
	{
		return minutes;
	}	
	
	public double getmph()
	{
		mph = Math.round(disance / (hours + minutes / 60.0));
		return mph;
	}
	
}