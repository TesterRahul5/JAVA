// WAP to find out sum of digit in given number.

import java.util.Scanner;
 

public class SumDigit
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		  int sum=0;
		  while(num!=0)
		  {
		       int rem= num%10;
				num=num/10;
				sum=sum+rem;
		  }
		   System.out.println("Sum of digit is "+sum);
      }
}
