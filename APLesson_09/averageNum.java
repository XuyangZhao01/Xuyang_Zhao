public class averageNum
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i <= numbers.length - 1; i++)
			numbers[i] = (int)(Math.random() * 100) + 1;
		
		System.out.println("Numbers...");
		
		for(int number : numbers)
			System.out.print(number + " ");
		
		
		
		System.out.println("The average of the numbers is..." + average(numbers));
	}
	public static int average(int[] numbers)
	{
		int average = 0;
		for(int number : numbers)
			average += number;
		return average/numbers.length;
	}
}