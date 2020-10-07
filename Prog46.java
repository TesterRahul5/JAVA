// WAP to reverse word of sentence of string.

public class Prog46 
{
	static String reverse(String s)
	{
		String finalstr="";
		String[] word = s.split("\\s");
		for(int i=0;i<=word.length-1;i++)
		{
			String newstr=word[i];
			String rev="";
			for(int j=newstr.length()-1;j>=0;j--)
			{
			   rev=rev+newstr.charAt(j);
			} 
			finalstr=finalstr+rev+" ";
		}
		return finalstr;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(reverse("Java is Programming Language"));
			
	}
}