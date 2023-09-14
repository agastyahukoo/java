package Java;
import java.util.Scanner;
public class Input_and_Scanners 
{
	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter something");
String Text = sc.nextLine();
int x = Integer.parseInt(Text); //String to int
System.out.println("Text is "+  x);
}
}
