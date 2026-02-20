package practice;

import java.util.Scanner;

public class smallestAndLargestNumber {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter total 5 numbers");
		int [] numbers = new int [5] ;
		
		
		for (int i=0 ; i<numbers.length ; i++)
		{
			System.out.print("Please enter "+(i+1)+ " number : ");
			numbers[i] = scanner.nextInt() ;
		}
		
//		for( int j : numbers)
//		{
//			System.out.println(j);
//		}
		
		int smallest = numbers[0];
		int largest  = numbers[0];
		
		for (int i = 1 ; i <numbers.length ; i++)
		{
			if (numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
			if (numbers[i]>largest)
			{
				largest = numbers[i] ;
			}
		}
		System.out.println("Smallest Number is : " + smallest);
		System.out.println("Largest Number is : " + largest);
	}

}
