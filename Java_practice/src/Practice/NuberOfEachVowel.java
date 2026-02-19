package Practice;

import java.util.HashMap;

public class NuberOfEachVowel 
{
	
	public static void main(String[] args) 
	{
		vowelCount("aeiouaeiouae") ;
		characterCount("Kshitiz Tyagi") ;
	}
	
	
	public static void vowelCount(String s)
	{
		HashMap<Character, Integer> vowels = new HashMap<Character , Integer>() ;
		vowels.put('a', 0) ;
		vowels.put('e', 0) ;
		vowels.put('i', 0) ;
		vowels.put('o', 0) ;
		vowels.put('u', 0) ;
		
		
		
		char characters [] = s.toCharArray() ;
		
		for(char c : characters)
		{
			if (vowels.containsKey(c))
			{
				vowels.put(c ,vowels.get(c)+1) ;
			}
		}
		
		for(Character key : vowels.keySet())
		{
			System.out.println("Key : " +key+ " Value : "+ vowels.get(key));
		}
		
		System.out.println(vowels);
		
	}
	
	public static void characterCount (String s)
	{
		char[] characters = s.toCharArray() ;
		
		HashMap <Character , Integer> hm = new HashMap<Character , Integer> () ;
		
		for (char c : characters)
		{
			if (hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1) ;
			}
			else
			{
				hm.put(c, 1) ;
			}
			
		
		}
		
			System.out.println(hm);
				
	}

}








