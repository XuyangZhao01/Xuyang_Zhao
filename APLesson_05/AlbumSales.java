public class AlbumSales
{
	public static void main(String[]args)
	{
		String name = "Xuyang Money";
		int units = 1000 ;
		String category = "Not Found";
		
		if (units >= 1000000)
			category = "Top Seller";
		else if (units >= 500000)
			category = "Good Seller";
		else if (units >= 10000)
			category = "Average Seller";
		else (units < 10000)
			category = "Needs Review";
		System.out.println(name + "=" + category);
	}
}