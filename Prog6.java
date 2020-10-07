// WAP to find product of number. ( ex-3 >> 3*3*3 = 27)

import java.util.Scanner;

public class Prog6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number value");
		int number=s.nextInt();
		int temp=1;
		for(int i=1;i<=number;i++)
		{
			temp=temp*number;
		}
	    System.out.println(temp);
	}
}
