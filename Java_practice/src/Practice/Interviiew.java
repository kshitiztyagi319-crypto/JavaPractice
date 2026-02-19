package Practice;

public class Interviiew {

	public static void main(String[] args) 
	{
		int[] array = {1,3,4,4,5, 1, 2, 2,1,3};
		int[] newarr = new int[array.length] ;
		int k = 0 ;
		
		
		
		
		for (int i = 0 ; i<=array.length-1 ; i++)
		{
			for (int j = i+1 ; j<=array.length ; j++)
			{
			if (array[i] != array[j])
			{
				newarr[k++] = array[i] ;
			}
		 
			}
			
		}
		
		for (int l : newarr)
		{
			System.out.println(l);
		}
		
	
	}
}
