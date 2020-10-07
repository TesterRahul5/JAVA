/*

1   1
 2 2 
  3  
 4 4 
5   5

*/

import java.util.Scanner;

public class Prog30 
{
	public static void main(String[] args) 
	{
		 Scanner s = new Scanner(System.in);
		  System.out.println("Enter the rows");
	     int row=s.nextInt();
				for(int i=1;i<=row;i++)
				{
					for(int j=1;j<=row;j++)
					{
						if(i==j||(i+j==6))
						{
							System.out.print(i);
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println();
			     }  
	}
}
