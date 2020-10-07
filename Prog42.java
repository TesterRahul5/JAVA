// Check Given String is Palindrome or not.

public class Prog42 
{
	public static void main(String[] args) 
	{
		String s = "MADAM" ;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev==s)
		{
			System.out.println(s+" is Palindrome");
		}
		else
		{
			System.out.println(s+" is not Palindrome");
		}
	}
}