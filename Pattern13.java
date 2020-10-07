/*  for row = 6
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
 */



import java.util.Scanner;

public class Pattern13
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Rows");
		int row = s.nextInt();
		  for(int i =row;i>=1;i--)
		  {
		    for(int j =1;j<=i;j++)
		    {
		       System.out.print(j+" ");
		    }
		  System.out.println();
		  }

		 for(int i = 2;i<=row;i++)
		 {
		   for(int j =1;j<=i;j++)
		   { 
		      System.out.print(j+" ");
		   }
		      System.out.println();
		  }
	 }
}
