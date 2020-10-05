// WAP to swap two number using temporary variable.

import java.util.Scanner;

public class Swap 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		
		int a = s.nextInt();
		int b = s.nextInt();
        int temp;
          System.out.println("Before Swapping Value of a and b is "+a+" "+ b);
            temp=a;
             a=b;
            b=temp;
          System.out.println("After Swapping Value of a and b is "+a+" "+ b);
	}
}
