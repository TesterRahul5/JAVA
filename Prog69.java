// WAP to Display upper triangular Matrix.

import java.util.Scanner;

public class Prog69
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = s.nextInt();
		System.out.println("Enter the column");
		int column = s.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("Enter element of array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=s.nextInt();
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
		System.out.println("Upper triangular matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i<=j)
				{
					System.out.print(arr[i][j]+" ");
				}
				else
				{
					System.out.print("0"+" ");
				}
			}
			System.out.println();
	}
	}
}
