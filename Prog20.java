// Display Disarium Number from 1 to given range.

import java.util.Scanner;

public class Prog20
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range= s.nextInt();
		for(int i=1;i<=range;i++)
		{
			int number=i;
		int temp=number;
		String s1 = number+ "";
		int length = s1.length();
		int sum=0;
		  while(number!=0)
		  {
			int rem=number%10;
			sum = sum +(int)Math.pow(rem,length);
			length--;
			number=number/10;
		  }
		   if(temp==sum)
		   {
			System.out.println(temp+" is Disarium Number");
		   }
	       }
        }
}
