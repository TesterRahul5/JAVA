/*

  * 
 * * 
* * * 
 * * 
  * 

 */

import java.util.Scanner;

public class Prog34
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row");
		int row= s.nextInt();
	     int star=1;
	     int space=row-1;
	     for(int i=1;i<row;i++)
	     {
	    	 for(int j=1;j<=space;j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 for(int k=1;k<=star;k++)
	    	 {
	    		 System.out.print("*"+" ");
	    	 }
	    	 System.out.println();
	    	 space--;
	    	 star++;
	     }
		for(int i=row;i>=1;i--)
		{
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	}

