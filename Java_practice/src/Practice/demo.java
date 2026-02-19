package Practice;

public class demo 
{
	
public static void main(String[] args)
{
	
	Name_string("Anand Kumar Sharma");
}

public static void  Name_string (String str)
{
	String [] split = str.split(" ") ;
	for (int i =0 ; i<split.length ; i++ )
	{
	
	System.out.print(split[i].charAt(0)+".") ;
	}
	
//	for (int j =0 ; j<1 ; j++)
//	{
//	System.out.println(split[j].charAt(0)) ;
//	}
}

}
