package practice;

public class checkPalindrome 
{
	public static void main(String[] args) 
	{
		IsPalindrome(1221) ;
		IsPalindrome(1234321) ;
		IsPalindrome(12345) ;
	}
	
	public static void IsPalindrome(int num)
	{
		System.out.println("Entered number is : "+ num);
		int sum = 0;
		int t ;
		int p;
		p=num ;
		while (num>0)
		{
			t = num%10 ;
			sum = (sum*10) + t ;
			num = num/10 ;
		}
	//	System.out.println(sum);
		
		if(p==sum)
		{
			System.out.println("Number is a palindrome");
		}
		else 
		{
			System.out.println("Number is not a palindrome");
		}
	}
}