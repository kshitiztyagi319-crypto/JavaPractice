package practice;

public class printNumberWithoutNumber 
{
	public static void main(String[] args) 
	{
		
//		char ch = 'b' ;
//		System.out.println((int)ch);
		
		String one = "a" ;
		int hundred = (int)('b');
		hundred = hundred+one.length()+ one.length() ;
		
		for (int i = one.length() ; i<= hundred ; i++)
		{
			System.out.print(i + " ");
		}
	}

}
