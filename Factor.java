// WAP to display factor from 1 to given range.

import java.util.Scanner;

public class Factor
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = s.nextInt();
		for(int i=1;i<=range;i++)
		{
		   int number = i;
		    System.out.print("Factor of "+number);
		   
		    for(int j=1;j<=number/2;j++)
		    {
		    	if(number%j==0)
		    	{
		    		System.out.print(" "+j+" ");
		    	}
		    }
		   System.out.println(number);
		}
	}
}
