// WAP to Accept 5 digit number from user and find out sum of even number and product of odd Number.

import java.util.Scanner;

public class Prog13 
{
	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  int sum=0;
	  int prod=1;
       for(int i=1;i<=5;i++)
       {
    	   System.out.println("Enter the Number");
    	   int num= s.nextInt();
       if(num%2==0)
       {
    	   sum=sum+num;
       }
       else
       {
    	   prod=prod*num;
       }
	}
System.out.println("Product of odd Number "+prod);
System.out.println("Sum of even Number "+sum);
}
}
