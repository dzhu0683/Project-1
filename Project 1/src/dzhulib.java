//Darren Zhu Period 2
//10/24/17

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
	public static String cutOut()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a mainStr.");
		String a = sc.nextLine();
		System.out.print("Input a subStr.");
		String b = sc.nextLine();
		String c = "";
		for(int x=0; x <= a.length(); x++)
		{
			if(a.substring(x, x + b.length()-1).equals(b))
			{
				c += (a.substring(0,x)) + (a.substring((x+b.length()-1),a.length()));
			}
		}
		return c;
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

