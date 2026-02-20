package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement 
{
	public static void main(String[] args) 
	{
		String names[] = {"Selenium" ,"Java" ,"Ruby" , "C" , "C++","Python" ,"Ruby" } ;
		String duplicate = names[0] ;
		
		for (int i=1 ; i<names.length ; i++)
		{
			if (names[i].equals(duplicate))
			{
				System.out.println("Duplicate element is : " + duplicate);
			}
			else
			{
				duplicate = names[i] ;
			}
		}
		
		System.out.println("Duplicate element is : " + duplicate);
		
		
		//Using nested for loop
		
		String name[] = {"Selenium" ,"Java" ,"Ruby" , "C" , "C++","Python" ,"Java" } ;
		
		for (int i = 0 ; i<name.length ; i++)
		{
			for (int j = i+1 ; j <name.length ; j++)
			{
				if (name[i].equals(name[j]))
				{
					System.out.println("Duplicate string is : " + name[i]);
				}
			}
		}
		
		
		//Using HashSet
		
		String elements[] = {"Selenium" ,"Java" ,"Ruby" , "C" , "C++","Python" ,"Java" } ;
		HashSet<String> hst = new HashSet<String>() ;
		
		for (String element : elements)
		{
			if (hst.add(element) == false)
			{
				System.out.println("Duplicate elemet is : " + element);
			}
		}
		
		
		//Using HashMap
		String values[] = {"Selenium" ,"Java" ,"Ruby" , "C" , "C++","Python" ,"Java" } ;
		HashMap<String,Integer> hm = new HashMap<String,Integer>() ;
		
		for (String value : values)
		{
			Integer count = hm.get(value) ;
			if (count == null)
			{
				hm.put(value, 1) ;			
			}
			else
			{
				hm.put(value , ++count) ;
			}
		}
		
		Set <Entry<String,Integer>> entrySet = hm.entrySet() ;
		
		for(Entry<String , Integer> entry : entrySet)
		{
			if (entry.getValue()>1)
			{
				System.out.println("Duplicate value is : " + entry.getKey());
			}
		}
	}

}







