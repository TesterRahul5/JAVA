// WAP to generate factorial of given number.


import java.util.Scanner;

 public class Factorial
 {
      int factorial(int n)
      {
    	int fact=1;
  		for(int i=1;i<=n;i++)
  		{
  			fact=fact*i;
  		}
  		return fact;
      }
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = s.nextInt();
		Factorial p = new Factorial();
          System.out.println(p.factorial(number));
	}
}
