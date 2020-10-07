// WAP to make every word first character as upper case in given sentence.

import java.util.*;

public class Prog51
{
	static String convertUpper(String s)
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
	       StringTokenizer s1 = new StringTokenizer(s," ");
	        int count= s1.countTokens();
	        String[] word = new String[count];
	        
	    for(int i=0 ; i<word.length;i++)
	    {
	    	word[i]= s1.nextToken();
	    	System.out.print(convertUpper(word[i]+" "));
	    }
	}
}