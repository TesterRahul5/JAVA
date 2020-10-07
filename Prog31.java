/*

*    *
**   **
***  ***
**** ****
**********

*/

import java.util.Scanner;

public class Prog31 
{
	public static void main(String[] args)
	{
		 Scanner s = new Scanner(System.in);
		  System.out.println("Enter the rows");
	     int row=s.nextInt();
			for(int i=1;i<=row;i++)
			{
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				for(int j=10;j>2*i;j=j-2)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}   
	}
	}
