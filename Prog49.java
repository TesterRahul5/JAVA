// WAP to make first character as uppercase in given string character.

import java.util.Scanner;
public class Prog49 
{
	static String converttoUpperCase(String s)
	{
		char ch = s.charAt(0);
		ch=Character.toUpperCase(ch);
		String s1 = ch+s.substring(1);
		return s1;
	}
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = ss.nextLine();
		System.out.println(converttoUpperCase(s));

	}
}
