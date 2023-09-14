package Java;

import java.util.Scanner;

public class Nested_Statements {
	public static void main(String[] args)
	{
		System.out.println("Enter your age.");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		if(age >= 18)
		{
			System.out.println("Enter your favourite food");
			String food = sc.nextLine();
			if(food.equals("pizza"))
			{
				System.out.println("Me too!");
			}
			else
			{
				System.out.println("Thats awesome!");
			}
		}
		else if (age < 18 && age >=13)
		{
			System.out.println("You are a teenager");
		}
		else
		{
			System.out.println("You are not a teenager or an adult");
		}
		
	}
}
