package Practice;

public class largestWord 
{
	public static void main(String[] args) 
	{
		String str = "This is java programming launguage" ;
		int greatest = 0 ;
		int smallest  = 0;
		//int smallest = 0 ;
		String[] split = str.split(" ") ;
		for (String s : split)
		{
			
			int length  = s.length() ;
			if(length > greatest)
			greatest = length ; 
			
			int length2 = s.length();
			smallest = length2 ;
			if (length2<smallest)
			smallest = length2 ;
					
		}
		
		System.out.println(greatest);	
		System.out.println(smallest);
		
	}

}
//
//String s=str[0]:
//String l=str{0};
//for (int i-=0; i<str.length ;i++)
// 