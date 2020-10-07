// WAP to find no of character in String without length().

import java.util.Scanner;
public class Prog48 
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = ss.nextLine();
		
		char[] ch = s.toCharArray();
		int count=0;
		for(char ele:ch)
		{
			count++;
		}
		System.out.println("Number of cahracter Present "+count);
	}
}