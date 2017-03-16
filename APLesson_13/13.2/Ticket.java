public abstract class Ticket
{
	private int serialNo;
	private double Price;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "serial #: " + this.serialNo + "\n price: " + this.getPrice();
	}
}