/*

5   5
 4 4 
  3  
 2 2 
1   1

 */
import java.util.Scanner;
public class Prog32 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		  System.out.println("Enter the rows");
	     int row=s.nextInt();
				for(int i=row;i>=1;i--)
				{
					for(int j=row;j>=1;j--)
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
