package Practice;

import java.util.Arrays;

//import java.util.ArrayList;
public class SortArrayInternally 
{
	public static void main(String[] args) 
	{
		int[] numbers = {1,2,6,11,0,33,6,123,44,12,1,345,5} ;
		//ArrayList<Integer> sorted = new ArrayList<Integer>() ;
		int temp = 0 ;
	
	//	SortedArray(numbers) ;
		
		for(int i= 0 ; i<numbers.length ; i++)
		{
			for (int j = i+1 ; j<numbers.length ; j++)
			{
				if(numbers[j]<numbers[i]) 
				{
					temp = numbers[i] ;
					numbers[i] = numbers[j] ;
					numbers[j] = temp ;
				}
			}	
		}
		for (int i : numbers)
		{
			System.out.println(i);
		}
		
	}
	
	public static void SortedArray(int[] number2)
	{
		Arrays.sort(number2);
		for (int i : number2) 
		{
			System.out.print(i+ " ");	
		}
		
	}

}
