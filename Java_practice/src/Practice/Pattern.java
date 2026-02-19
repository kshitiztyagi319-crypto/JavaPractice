package Practice;

public class Pattern 
{
	public static void main(String[] args) 
	{		
		//starTriangle(8) ;
		//starPyramid(8) ;
		starTriangleRight(8) ;
	}
	
	
//	   *
//	   **
//	   ***
//	   **** 
	public static void starTriangle(int row)
	{
		for (int i = 0 ; i<=row ; i++ )
		{
			System.out.println();
			for ( int j = 0 ; j<i ; j ++ )
			{
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	
//	  *
//   ***
//  *****
// *******
	
	public static void starPyramid(int row)
	{
		System.out.println(); 
		for (int i =0 ; i<row ; i++)
		{
			for (int j =row-i ; j>1 ; j--)
			{
				System.out.print(" ") ;
			}
			
			for (int j =0 ; j<=i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void starTriangleReverse(int row)
	{
		System.out.println();
		for (int i = 0 ; i<=row ; i++ )
		{
			System.out.println();
			for ( int j = row ; j>i ; j -- )
			{
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	
	public static void starTriangleRight(int row)
	{
		System.out.println();
		for (int i = 0 ; i<=row ; i++ )
		{
			System.out.println();
			for ( int j = row ; j<i ; j -- )
			{
				System.out.print("* ");
			}
		}
		System.out.println();
		
	}

}
