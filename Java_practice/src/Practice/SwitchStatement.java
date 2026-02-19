package Practice;

import java.util.Scanner;

public class SwitchStatement 
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		
		switch(num)
		{
		case 1 : System.out.println("you enter 1");
		break;
		
		case 2 : System.out.println("you enter 2");
		break;
		
		case 99 : System.out.println("you enter 9999");
		break ;
		
		default : System.out.println("Invalid number");
		
	
		}
		
	}
}
