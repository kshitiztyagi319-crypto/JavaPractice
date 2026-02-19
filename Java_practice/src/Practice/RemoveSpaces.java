package Practice;

public class RemoveSpaces
{
	public static void main(String[] args) 
	{
		//System.out.println(removeSpaces("  Kshitiz   ")) ;
		System.out.println(removeBlankSpace("Kshitiz   Tyagi    2"));
	}
	
	public static String removeSpaces(String str)
	{
		str = str.strip() ;
		return str ;
	}
	
	public static String removeBlankSpace(String str)
	{
		str = str.replaceAll("\\s+", " ") ;
		return str ;
	}

}
