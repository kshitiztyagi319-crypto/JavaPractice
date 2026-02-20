package practice;

public class swappingStrings 
{
	public static void main(String[] args) 
	{
		String a = "Hellooooo" ;
		String b = "World!!!!" ;
		
		System.out.println("Before Swapping : ");
		System.out.println(a);
		System.out.println(b);
		
		a = a+b ;
		b = a.substring(0 , a.length()-b.length()) ;
		a = a.substring(b.length()) ;
		
		
		System.out.println("After Swapping : ");
		System.out.println(a);
		System.out.println(b);
		
	}

}
