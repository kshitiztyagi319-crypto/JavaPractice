package practice;

import java.util.ArrayList;

public class removeCharFromString 
{
	public static void main (String[] args) 
	{
		
		//Method 1 
		
		String str = "Kshitiz Tyagi" ;
		String[] words = str.split("") ;
		
		ArrayList<String> reverse = new ArrayList<String>() ;

		for (int i=words.length-1 ; i>=0 ; i--)
		{
		if (!words[i].equals("i")) 
		{
			 reverse.add(words[i]) ;
		}
		}
		
		for (String s : reverse)
		{
			System.out.print(s);
		}
		                                                
		
		//Method 2 

		String input = "Kshitiz Tyagi" ;
		StringBuilder result = new StringBuilder();
		
		for (int i=0 ; i<input.length() ; i++)
		{
			if (input.charAt(i)!= 'i')
			{
				result.append(input.charAt(i)) ;
			}
		}
		StringBuilder reversed = new StringBuilder(result);
		reversed = result.reverse() ;
		System.out.println();
		System.out.println(reversed);
	}

}
