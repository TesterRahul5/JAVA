/*
00000
01000
00200
00030 
00004  (for n=5)
 */

import java.util.Scanner;

public class Prog19
{
	public static void main(String[] args) 
	{
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=ss.nextInt();
		for(int i=0;i<=row-1;i++)
		{
			for(int j=0;j<=row-1;j++)
			{
				if(i==j)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(0);
				}
			}
                   System.out.println();
		}
	}
}
