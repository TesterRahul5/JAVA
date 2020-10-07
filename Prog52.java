// WAP to make every word Last character as a upperCase.

import java.util.Scanner;
import java.util.StringTokenizer;

public class Prog52 
{
	static String converttoUpperCase(String s)
	{
		char ch = s.charAt(s.length()-1);
		ch=Character.toUpperCase(ch);
		String s1 = s.substring(0,s.length()-1)+ch;
		return s1;
	}
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = ss.nextLine();
       StringTokenizer s1 = new StringTokenizer(s," ");
        int count= s1.countTokens();
        String[] word = new String[count];     
    	for(int i=0 ; i<word.length;i++)
    	{
    		word[i]= s1.nextToken();
    		System.out.print(converttoUpperCase(word[i])+" ");
    	}
	}
}