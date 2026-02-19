package Practice;

import java.util.LinkedList;
import java.util.List;

public class Reverse 
{
	public static void main(String[] args) 
	{
		List <Integer> lis = new LinkedList<Integer>() ;
		lis.add(1) ;
		lis.add(3) ;
		lis.add(5) ;
		lis.add(8) ;
		//System.out.println(lis);
//		System.out.println(lis.size());		
//		for (int i = lis.size()-1 ; i>=0 ; i-- )
//		{
//			//reverseList.add(list.get(i)) ;
//			System.out.println(lis.get(i));
//		}
			reverseLinkList(lis) ;
	}
	
	
	public static void reverseLinkList(List<Integer> list)
	{
		List <Integer> reverseList = new LinkedList<Integer>() ;
		
		for (int i = list.size()-1 ; i>=0 ; i-- )
		{
			reverseList.add(list.get(i)) ;
			//System.out.println(list.get(i));
		}
		System.out.println(reverseList) ;
	}	
}