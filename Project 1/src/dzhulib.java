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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an interger.");
		int a = sc.nextInt();
		System.out.println("Enter a range.");
		int b = sc.nextInt();
		int num = 0;
		for(int c = 1; c <= b; c++)
		{
			num = a*c;
			System.out.println(num + " ");
		}
	}
}

