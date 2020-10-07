// WAP to count how many digit present in a given number?

import java.util.Scanner;
class Sample17 
{
  public static void main(String arg[])
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the number value");
       int num=s.nextInt();
  int count=0;
  while(num!=0)
  {
		num=num/10;
		count++;
  }
   System.out.println("Number of Digit is "+count);
 }
}  
