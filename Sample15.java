// WAP to generate prime Number between 2 to 500 ?

import java.util.Scanner;
class Sample15 
{
  public static void main(String arg[])
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the range value");
	  int range = s.nextInt();
    for(int num=2;num<=range;num++)
        {
           int count=0;
          for(int i=1;i<=num;i++)
          {
              if(num%i==0)
	          {
	            count++;
	          }
          }
          if(count==2)
          {
        	  System.out.println(num+" is a Prime Number");
          }
        else
          {
        	System.out.println(num+" is not Prime Number");
          }
        }
    }
}