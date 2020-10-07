// WAP to generate strong number 1 to 1000.

import java.util.Scanner;

public class Prog4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = s.nextInt();
		for(int j=1;j<=range;j++)
		{
		 int number = j;
		int temp=number;
		int rem;
		int sum=0;
		    while(number!=0)
		    {
			int fact=1;
                        rem=number%10;
    			    for(int i=1;i<=rem;i++)
      			   {
        			fact=fact*i;
       			   }
         		sum= sum+fact;
          		number= number/10;   
	   	    }
			if(sum==temp)
			{
			   System.out.println(temp+" is Strong Number");
			}
	       }
        }
}
