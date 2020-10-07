// WAP to show diagonal element , upper triangular element as "*" and lower triangular element as "#".

import java.util.Scanner;

public class Prog78
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row");
		int row = sc.nextInt();
		System.out.println("Enter the column");
		int column = sc.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("Enter element of array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Matrix is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println("Diagonal Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i==j)
				{
					System.out.print(arr[i][j]+" ");
				}
				else if(i<=j)
				{
					System.out.print("*"+" ");
				}
				else 
				{
					System.out.print("#"+" ");
				}
			}
			System.out.println();

	}
}
}
