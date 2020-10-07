// WAP to remove spaces which is present in the given string.

public class Prog73 
{

	public static void main(String[] args) 
	{
		String s = "Qspider is a Institute";
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
		
		// Another way to remove spaces 
		char[] ch = s.toCharArray();
		StringBuffer s3 = new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='\t')
			{
				s3.append(ch[i]);
			}
		}
		System.out.println(s3);
	}
}
