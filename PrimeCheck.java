 /* Check the given number is Prime or not  */


import java.util.Scanner;

public class PrimeCheck
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		
			for( int i =2;i <num;i++)
			{
				if(num% i == 0)
				{
					System.out.println(num + " is not Prime Number");
					break;
				}
				else
				{
					System.out.println(num + " is Prime Number");
					break;
				}
			}

	}

}
