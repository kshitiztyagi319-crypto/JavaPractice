package Practice;
import java.util.ArrayList ;


import java.lang.reflect.Array;

public class Reverse_String {

	public static void main(String[] args) 
	{
		
		String str = "Kshitiz Tyagi" ;
		System.out.println(reverse_string(str)) ;
		String[] split = str.split(" ");
		for (String s : split )
		{
			System.out.println(s);
		}
		
		char [] characters = str.toCharArray();
		for (char c : characters)
		{
			System.out.println(c);
		}

	}
	
	public static StringBuffer reverse_string(String str)
	{
		StringBuffer sf = new StringBuffer (str);
		sf.reverse() ;	
		return sf ;
	}
	


}
