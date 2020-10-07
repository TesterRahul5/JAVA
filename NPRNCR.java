// NCR and NPR Example

import java.util.Scanner; 

public class NPRNCR
{
	static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		System.out.println("Enter value of r");
		int r = s.nextInt();
		System.out.println("NPR is "+ factorial(n)/factorial(n-r));
		System.out.println("NCR is "+ factorial(n)/(factorial(n-r)*factorial(r)));
	}

}
