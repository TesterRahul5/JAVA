// WAP to perfect no between 1 to range.

import java.util.Scanner;

 public class Prog1
 {
   public static void main(String[] args) 
   {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value of Range");
	int range = s.nextInt();
	   for(int number=1;number<=range;number++)
	   {	
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
			
	   }
    }
 }
