/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/

import java.util.Scanner;

public class Prog29 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = s.nextInt();
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
