// WAP to reverse the string by using recurssion.

public class Prog62
{

	static String  reverse(String s)
	{
		if(s.length()==0)
       return "";
		return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
			   
	}
	public static void main(String[] args)
	{
		System.out.println(reverse("Shusma"));

	}

}
