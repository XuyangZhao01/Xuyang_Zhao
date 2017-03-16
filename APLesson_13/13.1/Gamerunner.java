public class Gamerunner
{
	public static void main(String[]args)
	{
		XB xbox = new XB("XB");
		System.out.println(xbox);
		
		PlayStation ps = new PlayStation("PlayStation");
		System.out.println(ps);
		
		PC pc = new PC("PC");
		System.out.println(pc);
	}
}