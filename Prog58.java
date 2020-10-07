// WAP to replace vowels to '*' , digit to the '#' and whitespace with '$'.

public class Prog58 
{
	public static void main(String[] args) 
	{
		String s = "Sagar 77 Sa";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				ch='*';
			}
			else  if(Character.isDigit(ch))
			{
				ch='#';
			}
			else  if(Character.isWhitespace(ch))
			{
				ch='$';
			}
			System.out.print(ch);
	     }
	}
}