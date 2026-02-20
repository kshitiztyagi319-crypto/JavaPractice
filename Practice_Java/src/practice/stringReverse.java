package practice;

import java.util.Scanner;

public class stringReverse {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter a String : ");
		String string = sc.next() ;
		
		//reverseWithStringBuffer(string) ;
		reverseWithForLoop(string) ;
		
		
	}
	
	public static void reverseWithStringBuffer(String string)
	{
		StringBuffer sf = new StringBuffer(string) ;
		System.out.println(sf.reverse()) ;	
		
	}
	
	public static void reverseWithForLoop(String string)
	{
		String reverse = "" ;
		for (int i = string.length()-1 ; i >= 0 ; i--)
		{
			reverse = reverse+string.charAt(i) ;
 		}
		System.out.print(reverse);
	}

}
