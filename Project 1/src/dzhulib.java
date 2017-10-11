import java.util.Scanner;
public class dzhulib 
{
	public static void dateStr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input date in the format mm/dd/yyyy.");
		String old = sc.nextLine();
		String a = old.substring(0, 2);
		String b = old.substring(3, 5);
		String c = old.substring(6, 10);
		System.out.print(b + "-" + a + "-" + c);
	}
	public static void cutOut()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a mainStr.");
		String a = sc.nextLine();
		System.out.print("Input a subStr.");
		String b = sc.nextLine();
		System.out.print(a + " ");
	}
	public static void multiplicationTable()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an interger.");
		int a = sc.nextInt();
		System.out.println("Enter a range.");
		int b = sc.nextInt();
		int num = 0;
		for(int c = 0; c <= b; c++)
		{
			num = a*c;
			System.out.println(num + " ");
		}
	}
}

