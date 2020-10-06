/*
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
 */

import java.util.Scanner;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the row value");
		  int row = sc.nextInt();
		  
		  for(int i=1;i<=row;i++)
		  {
			  for(int j=1;j<=row;j++)
			  {
				  System.out.print("*"+" ");
			  }
		   System.out.println();
		  }
	}
}
