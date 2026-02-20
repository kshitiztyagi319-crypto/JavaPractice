package practice;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int[] input = {1,2,5,6,7,9} ;
		int len = input.length ;
		
		
//		for (int i=input.length-1 ; i>=0 ; i--)
//		{
//			System.out.print(input[i]+" ");
//		}
//	
	
	int[] rev = new int[len] ;
	
	for (int j=0  ; j<len ; j++ )
	{
		rev[j] = input[(len-j-1)] ;
	}
	
	for (int k : rev)
	{
		System.out.println(k);
	}
	
	}

}

