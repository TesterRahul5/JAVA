/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 */

import java.util.Scanner;

public class Pattern9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line number");
		  int line=sc.nextInt();
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
			  		System.out.print(k + " ");
			  	}
			  	 System.out.println();
			  	 space--;
			  	 star++;
		  }
	}
}

