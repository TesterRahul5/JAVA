// String operations 

public class String2
{
	public static void main(String[] args)
	{
		String s = new String("Hello");
		String s1 = new String("gone");
		StringBuffer s2 = new StringBuffer("Hello People");
			System.out.println(s.equals(s1));
			System.out.println(s1.compareTo(s));
			
		s2.append(" How r u");
		s=s.concat(" Well");
				System.out.println(s2);
				System.out.println(s);
				System.out.println(s.length());
				System.out.println(s.toUpperCase());
				System.out.println(s.toLowerCase());
				System.out.println(s2.charAt(15));
				System.out.println(s1.indexOf('n'));
				System.out.println(s2.substring(0, 10));
	}
}
