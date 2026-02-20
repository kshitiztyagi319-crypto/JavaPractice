package practice;

public class missingNumberInArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,9} ;
		int sum = 0 ;
		int sum1 = 0 ;
		
		for (int i = 0 ; i<arr.length ; i++)
		{
			sum = sum+ arr[i] ;
		}
		
		for (int j = 0 ; j<=arr.length+1 ; j++)
		{
			sum1 = sum1+j ;
		}
		
		System.out.println("Missing number is : " + (sum1-sum) );
		
	}
}
