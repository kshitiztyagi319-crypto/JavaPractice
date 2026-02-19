package Practice;

import java.util.Arrays;
import java.util.HashMap;

public class Sorting 
{
	public static void main(String[] args) 
	{
		//int[] array = {2,4,6,8,1,5} ;
		//sortArray(array) ;
		
		
		HashMap<String , Integer> hm = new HashMap<String, Integer> () ;
		hm.put("A", 2) ;
		hm.put("B", 1) ;
		hm.put("C", 4) ;
		hm.put("D", 3 ) ;
		
		sortHashMap(hm) ;
	}
	
	
	public static void sortArray(int[] number)
	{
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
	}
	
	public static void sortHashMap(HashMap<String,Integer> map)
	{
		System.out.println(map.keySet()) ;
		for (String c : map.keySet())
		{
			 System.out.println(map.get(c));
		}
	}
	

}
