import java.util.Scanner; // fiboncai Series

public class Fibonaci
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for series");
		int num =s.nextInt();
		int n1=0,n2=1,n3;
		
		System.out.print(n1+" "+ n2+ " ");
		
		for(int i=1;i<=num;i++)
		{
			n3=n1+n2;
			System.out.print(n3+ " ");
			n1=n2;
			n2=n3;
		}
	}

}
