// WAP to addition of Two Matrix.

public class Prog67 
{
	public static void main(String[] args)
	{
		int a[][] = {{27,54,62},{645,46,293}};
		int b[][] = {{76,98,49},{654,97,984}};
		int c[][] = new int[2][3];
		System.out.println("Display Matrix A");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println("Display Matrix B");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println("Addition of matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}	
	}

}
