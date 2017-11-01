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
		String line = sc.nextLine();
		System.out.print("Input a subStr.");
		char remove = sc.next().charAt(0);
		for(int i = 0; i <= line.length();i++)
		{
			char ch = line.charAt(i);
			if( remove == ch)
			{
				String before = line.substring(0,i);
				String after = line.substring(i + 1);
				line = before + after;
				break;
			}
		}
		return line;
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

