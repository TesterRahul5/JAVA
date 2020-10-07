// Palindrome No from 1 to 500.

import java.util.Scanner;

class Sample16  
{
  public static void main(String arg[])
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the range value");
	  int range = s.nextInt();
	  int num,r,rev,temp; 
    for(num=1;num<=500;num++)
	{
         temp=num;
         rev=0;
         while(temp!=0)
         {
             r=temp%10;
             rev=rev*10+r;
             temp=temp/10;
         }
         if(rev==num){
             System.out.println(num+ "Palindrome");
		 }
         
    }
} 
}
