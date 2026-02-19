w4package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CountVowels {
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a String : ");
		String string = sc.next() ;
		int VowelCount = 0 ;
		int ConsonantCount = 0 ;
		
		for (int i = 0 ; i<string.length() ; i++)
		{
			if (isVowel(string.charAt(i)))
			{
				VowelCount ++ ;
			}
			else
			{
				ConsonantCount++ ;
			}
		}
		System.out.println("Number of Vowels in string = " + VowelCount);
		System.out.println("Number of Consonant in string = " + ConsonantCount);
		
	}
	
	public static boolean isVowel(char t)
	{
		return t=='a' || t=='e' || t=='i'|| t=='o'|| t=='u' ||
				t=='A' || t=='E' || t=='I'|| t=='O'|| t=='U'
				;
		
	}

	  

}
