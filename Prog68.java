// WAP  to multiply 2-D matrix and display.

public class Prog68
{
	public static void main(String[] args) 
	{
		int a1[][] = {{2,4,5},{9,1,8},{3,7,6}};
		int a2[][] = {{12,9,25},{20,23,32},{14,17,31}};
		int result[][] = new int[3][3];
		System.out.println("Multiplication of Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					result[i][j] += a1[i][k]*a2[k][j];
				}
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
        
	}

}
