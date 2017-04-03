import java.util.Arrays;
public class Car implements Location
{
	private final int ID;
	private double[] location = new double[2];
	
	public Car()
	{
		ID = (int)(Math.random() * 1000000) + 100000;
	}
	
	public void move(double EX, double WHY)
	{
		location[0] += EX;
		location[1] += WHY;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}