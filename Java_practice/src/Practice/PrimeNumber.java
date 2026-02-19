package Practice;

public class PrimeNumber 
{
	
	public static void main(String[] args) 
	{
		System.out.println(isPrime(12));
	}
	
	
	public static boolean isPrime(int i)
	{
		if (i==0 || i==1)
		{
			return false ;
		}
		if (i==2)
		{
			return true;
		}
		
		for (int n=2 ; n<i ; n++)
		{
			if(i % n == 0)
			{
				return false;
			}
		}
		
		return true;
	}

}
