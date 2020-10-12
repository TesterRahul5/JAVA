// Input choice taken from user and corresponding pattern

import java.util.Scanner; 

public class Assign1 
{
	Scanner s1 = new Scanner(System.in);
	void printpattern()
	{
		System.out.println("Enter the value of n");
		int n=s1.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	void printtable()
	{
		System.out.println("Enter the value of num");
		int num=s1.nextInt();
		for(int i=num;i<=num;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	public static void main(String[] args) 
	{
		Assign1 a = new Assign1();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the Choice");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1: a.printpattern();
			        break;
			case 2: a.printtable();;
	                 break;
	        default: System.out.println("Invalid Choice enter");
			}
		}

	}

}
