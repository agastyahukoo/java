package Java;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.equals("Text"))
		{
			System.out.print("You typed Text");
		}
		else if(s.equals("Hi"))
		{
			System.out.print("Hi");
		}
		else
		{
			System.out.print("You did not type Text");
		}
	}
}
