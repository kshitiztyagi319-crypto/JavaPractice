package Practice;

public class Factorial 
{
	public static void main(String[] args) 
	{	
		System.out.println(factorialOfNumber(10)) ;
	}
	
	
	public static int factorialOfNumber(int i)
	{
		int facto =1 ;
		for (int j=1 ; j<=i ; j++)
		{
			facto= facto*j ; //20 ,
		}
		return facto ;
	}

}
