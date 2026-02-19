package Practice;

public class FibonacciSeries 
{
	
	public static void main(String[] args) 
	{
		
		Fibonacci (10) ;
		
	}
	
	public static void Fibonacci (int count)
	{
		
		int a = 0 ;
		int b = 1 ;
		int c = 1 ;
		
		for (int i = 1 ; i<=count ; i ++)
		{
			System.out.print(a + ","); //0 , 1 , 1 , 2 , 3 , 5
			
			a=b ; //1 , 1 , 2 , 3 , 5
			b=c ; //1 , 2 , 3 , 5 , 8
			c=a+b ; //2, 3, 5 , 8 , 13
			
		}
	}

}
