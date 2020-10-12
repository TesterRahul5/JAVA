import java.util.Scanner;

public class Sample43 
{
	void printpattern()
	{
		for(int i=1;i<=3;i++)
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
		for(int i=2;i<=2;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	public static void main(String[] args) 
	{
		Sample43 m = new Sample43();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the Choice");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1: m.printpattern();
			        break;
			case 2: m.printtable();;
	                 break;
	        default: System.out.println("Invalid Choice enter");
			}
		}

	}

}
