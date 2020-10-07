// WAP to Reverse Sentence.

public class Prog43 
{
	public static void main(String[] args) 
	{
		String s = "I Love My India";
		String finalstr = "";
		String[] word = s.split("\\s");
		for(int i=word.length-1;i>=0;i--)
		{
			finalstr=finalstr+(word[i]+" ");
		}
		System.out.println(finalstr);
	}
}
