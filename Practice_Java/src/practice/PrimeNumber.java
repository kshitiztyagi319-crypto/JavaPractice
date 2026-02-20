package practice;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(IsPrime(17));
		ListOfPrime(17);
	}
	
	public static boolean IsPrime (int num)
	{
		if(num<1) {
			return false ;
		}
		
		for (int i=2 ; i<num ; i++)
		{
			if(num % i ==0)
			{
				return false ;
			}
		}
		return true;
	}
	
	public static void ListOfPrime(int num)
	{
		for (int i =1 ; i<=num ; i++)
		{
			if(IsPrime(i))
			{
				System.out.println(i);
			}
		}
	}
}
