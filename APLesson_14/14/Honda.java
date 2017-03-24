import java.util.Arrays;
public class Honda implements Location
{
	private double[] loca;
	
	public Honda()
	{
		loca = new double[2];
	}
	
	public Honda(double[] L)
	{
		loca = new double[2];
		loca = L;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(double ex, double why)
	{
		loca[0] = ex;
		loca[1] = why;
	}
	
	public double[] getLoc()
	{
		return loca;
	}
}