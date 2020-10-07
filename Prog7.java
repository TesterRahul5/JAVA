// WAP to find out smallest digit in given number


import java.util.Scanner;

public class Prog7
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		  int small=9;
		  while(num!=0)
		  {
		      int rem= num%10;
            		if(small>=rem)
             		{
              		  small=rem;
             		}
            	     num=num/10;
		  }
          System.out.println("Smallest Number is "+ small);
	}	  
}
