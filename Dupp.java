// WAP to count vowels,space and digit.

import java.util.Scanner;

public class Dupp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int vowel=0,digit=0,space=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
			}
			else  if(Character.isDigit(ch))
			{
				digit++;
			}
			else  if(Character.isWhitespace(ch))
			{
				space++;
			}
	     }
		System.out.println("Number of Vowels "+vowel);
		System.out.println("Number of Digit "+digit);
		System.out.println("Number of Spaces "+space);
	}
}