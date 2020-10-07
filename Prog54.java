// WAP to Make even position as uppercase character.(sushma>> SuShMa).

import java.util.Scanner;
public class Prog54
{
	public static void main(String[] args)
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = ss.nextLine();
		String s1="";
		char[] ch = s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i%2==0)
			{
				s1=s1+Character.toUpperCase(ch[i])+"";
			}
			else
			{
				s1=s1+ch[i]+"";
			}
		}
		System.out.println(s1);	
	}
}