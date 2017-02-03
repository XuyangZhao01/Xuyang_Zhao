import java.lang.Math.*;
public class DistancePoints
{
	private double distance;
	private int x1, y1, x2, y2;

	
	public DistancePoints()
	{
		distance = 0;
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	
	public DistancePoints(int x, int y, int xx, int yy)
	{
		x1 = x;
		y1 = y;
		x2 = xx;
		y2 = yy;
		distance = 0;
	}
	
	public void setCoordinates(int x, int y, int xx, int yy)
	{
		x1 = x;
		y1 = y;
		x2 = xx;
		y2 = yy;
	}
	
	public int getx1()
	{
		return x1;
	}
	
	public int gety1()
	{
		return y1;
	}
	
	public int getx2()
	{
		return x2;
	}
	
	public int gety2()
	{
		return y2;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		return distance;
	}
}