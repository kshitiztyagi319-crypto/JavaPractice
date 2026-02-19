package Practice;

import java.util.ArrayList;
import java.util.List;

public class OnlyOddList 
{
	public static void main(String[] args) 
	{
		List <Integer>number = new ArrayList <Integer> ();
		number.add(3); 
		number.add(5);
		number.add(7);
		number.add(9);
		
		List <Integer>number2 = new ArrayList <Integer> ();
		number2.add(2); 
		number2.add(4);
		number2.add(6);
		number2.add(9);
		//System.out.println(number);
		System.out.println(cotainsOnlyOddNumber(number)) ;
		System.out.println(cotainsOddNumber(number2)) ;
		
	}
	
	public static boolean cotainsOnlyOddNumber(List<Integer> list)
	{
		for (int i : list)
		{
			System.out.println(i);
			if (i % 2==0)
			return false ;	
		}
		
		return true;
		
	}
	
	public static boolean cotainsOddNumber(List<Integer> list)
	{
		for (int i : list)
		{
			System.out.println(i);
			if (i % 2 != 0)
			return true ;	
		}
		
		return false;
		
	}

}
