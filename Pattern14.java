/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 */

import java.util.Scanner;

class Pattern14
{
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the rows");
     int line=s.nextInt();
     int star=1;
     int space=line-1;
     for(int i=1;i<=line;i++)
     {
    	 for(int j=1;j<=space;j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=1;k<=star;k++)
    	 {
    		 System.out.print("*"+ " ");
    	 }
    	 System.out.println();
    	 space--;
    	 star++;
     }
  }
}
