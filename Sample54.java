public class Sample54  // String Example
{
	public static void main(String[] args) 
	{
		   String s ="Qspider is a Institute";
		   String[] s1 = s.split("\\s");
		   for(String words:s1)
		   {
			   System.out.println(words);
		   }
		   String s2 = "qspider";
		   String s3 = "Qspider";
		   System.out.println(s2.equals(s3)); // false
		   String s4 = " I Love You";
		   String s5 = s4.replaceAll("\\s",""); 
		   System.out.println(s5);  // ILoveYou
		   Sample54 ss = new Sample54();
		   System.out.println(ss.toString()); // Sample54@15db9742
		   System.out.println(ss.hashCode()); // 366712642
	}
}
