//  Binary to Decimal Conversion 

import java.util.Scanner;

class BinaryToDecimal
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the binary Number");
		int bin=s.nextInt();
		int mul=1;
		int sum=0;
		while(bin>0)
		{
			int rem=bin%10;
			sum=sum+rem*mul;
			mul=mul*2;
			bin=bin/10;
		}
		System.out.println("Decimal Number is " + sum);
	}
}
