// WAP to Print 1 to 10 without using any loop.
public class Prog61 
{
	static void number(int i)
	{
		if(i<=10)
		{
			System.out.println(i);
			i++;
			number(i);
		}
		
	}
	public static void main(String[] args) 
	{
		
       number(1);
	}

}
