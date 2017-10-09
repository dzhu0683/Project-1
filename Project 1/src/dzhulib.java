import java.util.Scanner;
public class dzhulib 
{
	public static void dateStr()
	{
		//Scanner integer = new Scanner(System.in);
		//System.out.print("Input date in the format mm/dd/yyyy.");
		//String old = 
	}
	public static void cutOut()
	{
		
	}
	public static void multiplicationTable()
	{
		Scanner integer = new Scanner(System.in);
		System.out.print("Enter an interger.");
		int a = integer.nextInt();
		System.out.println("Enter a range.");
		int b = integer.nextInt();
		for(int c = 1; c <= b; c++)
		{
			a = a * c;
			System.out.println(a + " ");
		}
	}
}

