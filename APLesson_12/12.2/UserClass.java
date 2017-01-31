public class UserClass
{
	private String first;
	
	private String last;
	
	private String avatar;
	
	private int userID;
	
	public void User(String f, String l)
	{
		first = f;
		
		last = l;
		
		avatar = "n/a";
	
	userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void  User(String f, String l, String av)
	{
		first = f;
		
		last = l;
		
		avatar = av;
		
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + first + "\nLast Name: " + last + "\nAvatar: " + avatar + "\nUser ID#: " + userID;
	}
}