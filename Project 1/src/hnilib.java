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
	public static boolean isPerfectSquare(int x) 
	{
		int y = (int) Math.sqrt(x);
		return (y * y == x);
	}
	public static void isFibonnaci() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer");
		int x = sc.nextInt();
		int pol = ((5 * x * x) - 4);
		int tst = ((5 * x * x) + 4);
		if((isPerfectSquare(tst) == true) || ((isPerfectSquare(pol) == true))) 
		{
			System.out.println("This integer is in the Fibonnaci Sequence");
		} 
		else 
		{ 
			System.out.println("This integer is not in the Fibonnaci Sequence");
		}
	}
}