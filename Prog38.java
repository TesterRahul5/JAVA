/*

    ABCD
   ABCD
  ABCD
 ABCD
ABCD

*/

import java.util.Scanner;

public class Prog38 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		  System.out.println("Enter the row");
		  int row=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(" ");
		   }
			for(int j=1;j<=4;j++)
			{
				System.out.print((char)(64+j));
		   }
System.out.println();
	}
	}
}
