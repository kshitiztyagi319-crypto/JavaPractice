package Practice;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		System.out.println(isPalindrome("123")) ;
		System.out.println(isPalindrome("12222221")) ;
	}
	
	public static boolean isPalindrome(String string)
	{
		StringBuffer sb = new StringBuffer(string) ;
		System.out.println("String is : "+string);
		String reverse = (sb.reverse().toString());
		System.out.println("Reverse is : "+reverse);
		
		
		if (string.equals(reverse)) 
		{
			return true;
		}
		return false ;
		
	}
}
