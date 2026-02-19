package Practice;

import java.util.Scanner;

public class SwapNumber {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter first number :");
		int a = sc.nextInt() ;
		System.out.print("Enter second number : ");
		int b = sc.nextInt() ;
		
		swapNumber(a,b) ;
		
	}
	
	public static void swapNumber(int a , int b)
	{
		b = a+b ;
		a = b-a ;
		b = b-a ;
		System.out.println("Afetr swap value of a ; " + a);
		System.out.println("After swap value of b :"+b);
	}
	
	

}
