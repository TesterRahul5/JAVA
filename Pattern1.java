/*
A 
B B 
C C C 
D D D D 
 */

import java.util.Scanner;

public class Pattern1
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the row value");
	  int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{                          
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(i+64)+ " ");
			}
			System.out.println();
		}
	}

}
