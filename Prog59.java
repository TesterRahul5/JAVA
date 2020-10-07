// WAP to find out non-repeated present in given string.

public class Prog59
{
	public static void main(String[] args)
	{
		String s= "javaProgram";
	
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
			  if(s.charAt(i)==s.charAt(j))
			  {
				  count++;
			  }
			}
			if(count<=1)
			{
				System.out.println(s.charAt(i));
			}
		}
	}

}
