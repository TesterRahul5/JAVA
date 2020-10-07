/*

1 
2 5 
3 6 8 
4 7 9 10 

*/

import java.util.Scanner;

public class Prog24 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Rows");
		int row = s.nextInt();
		for(int i=1;i<=row;i++)
		{
			int number =i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number+row-j;
			}
			System.out.println();
		}
	}

}
