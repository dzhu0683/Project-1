import java.util.Scanner;
public class hnilib 
{
	public static void sumUpTo(int x) 
	{
		System.out.print((x * (x + 1)) / 2);
	}
	public static void isPalidrome() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String");
		String x = scanner.nextLine();
		StringBuilder stringbuilder = new StringBuilder(x);
		stringbuilder.reverse();
		if(x.equals(stringbuilder.toString())) 
		{
			System.out.println("Palidrome");
		} 
		else 
		{
			System.out.println("Not a Palidrome");
		}
	}

}