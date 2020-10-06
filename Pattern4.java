/*
A 
A B 
A B C 
A B C D
 */

import java.util.Scanner;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the row value");
		  int r = sc.nextInt();
		  
		  for(int i=1;i<=r;i++)
		   {
			  int alphabet=65;                          
			  for(int j=1;j<=i;j++)
			  {
				  System.out.print((char)alphabet+ " ");
				  alphabet++;
			  }
			  System.out.println();
		   }
	}
}
