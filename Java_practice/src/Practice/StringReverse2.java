package Practice;

//import java.util.ArrayList;

public class StringReverse2 
{
	public static void main(String[] args) 
	{	
		
		String str = "Kshitiz Tyagi" ;
	//	ArrayList<String> list = new ArrayList<String>();
		String[] words = str.split(" ") ;
		
		for (String s : words)
		{
			System.out.print(" ");
			char[] characters = s.toCharArray() ;
			for (int j = characters.length-1 ; j>=0 ; j--)
			{
				System.out.print(characters[j]);
			}
		}
		
		
	}

}
