package practice;

import java.util.Scanner;

public class CountVowels 
{
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a string : ");
	String str = scanner.next() ;
	
	VowelCount(str);
	
	}
	
	
	
	public static void VowelCount(String string)
	{
		int count = 0 ;
		for (int i = 0 ; i <string.length() ; i++)
		{
			if (string.charAt(i)=='a' ||
				string.charAt(i)=='e' ||
				string.charAt(i)=='i' ||
				string.charAt(i)=='o' ||
				string.charAt(i)=='u' )
									
				count++ ;
		}
		System.out.println(count);		
		}
		
	}

