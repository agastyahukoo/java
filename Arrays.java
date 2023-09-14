package Java;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] arr = new String[5];
        String[] text= {"Hello","Hi","Test","Comp","Physics"};
        String x = text[2];
        System.out.print(x);
        Scanner sc = new Scanner(System.in);
        text[2]= sc.nextLine();
        x = text[2];
        System.out.print(x);
         
	}

}
