/*

1 * * * * 
1 2 * * * 
1 2 3 * * 
1 2 3 4 * 
1 2 3 4 5 

*/

import java.util.Scanner;

public class Prog35 
{
  public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the row");
	  int row=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=row-1;k>=i;k--)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
}
