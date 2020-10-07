// WAP to generate armstrong Number between 1 to given range.

import java.util.Scanner;


public class Prog15 
{
	public static void main(String[] args) 
	{
 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = s.nextInt();
		for(int i=1;i<=range;i++)
		{
			int number=i;
		int temp=number;
		String s1 = number+ "";
		int size = s1.length();
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			sum = sum +(int)Math.pow(rem,size);
			temp=temp/10;
		}
		if(number==sum)
		{
			System.out.println(number+" is ArmStrong Number");
		}
		
		}
}
	}
