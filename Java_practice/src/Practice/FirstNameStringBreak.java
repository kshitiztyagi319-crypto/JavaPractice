package Practice;

public class FirstNameStringBreak 
{
	public static void main(String[] args) 
	{
		
		String str = "Ashok Kumar Tyagi" ;
		String[] word = str.split(" ") ;
		
		for(int i = 0 ; i<=1 ; i++)
		{
			//System.out.println(word[i]);
			char[] character = word[i].toCharArray() ;
			System.out.print(character[0]+" ");
		}
		
		System.out.print(word[2]);
	}

}
