// WAP to check number is perfect number or not.

import java.util.Scanner;

public class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of Number");
		int number = s.nextInt();
		int temp=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				temp=temp+i;
			}
		}
		
		if(temp==number)
		{
			System.out.println(number+" is Perfect Number");
		}
		else
		{
			System.out.println(number+" is not Perfect Number");
		}
	}
}
