// WAP to Retrieve middle character of given string.

import java.util.Scanner;

public class Prog50 
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = ss.nextLine();
		if(s.length()%2==0)
		{
			System.out.println(s.charAt((s.length()-1)/2)+" "+s.charAt(s.length()/2));
		}
		else
		{
			System.out.println(s.charAt((s.length()/2)));
		}	
	}	
}