// WAP to find repeated character which is present in given string.

public class Prog60
{
	public static void main(String[] args) {
		String s= "javaProgram";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
			  if(s.charAt(i)==s.charAt(j))
			  {
				  count++;
			  }
			}
			if(count==1)  // count>=1 >> repeated character print more times.
			{
				System.out.println(s.charAt(i));
			}	
			
		}		
	}
}
