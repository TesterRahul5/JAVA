// WAP to Seperate digit and character.

public class Prog44
{
	static String num = "";
	static String letter = "";
	static void seperateDigitchar(String s)
	{
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				num=num+ch;
			}
			else
			{
				letter=letter+ch;
			}
		}
		System.out.println("letter are "+letter);
		System.out.println("Digits are "+num);
	}
	public static void main(String[] args) 
	{
		seperateDigitchar("AVfs136t");

 }
}
