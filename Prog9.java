// WAP to Convert Number from decimal to binary.

import java.util.Scanner;

public class Prog9 
{
	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  int number=s.nextInt();
	  String bin = " ";
            while(number!=0)
            {
            	int rem=number%2;
            	number=number/2;
            	bin = rem+bin;
            }
            System.out.println("Binary Value of given Number is "+ bin);
	}

}
