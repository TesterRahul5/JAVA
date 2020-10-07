// Swapping two String

public class Prog56 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2="Developer";
		System.out.println("value of s1 "+s1+" value of s2 "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("value of s1 "+s1+" value of s2 "+s2);

	}

}
