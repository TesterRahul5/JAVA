
// WAP to arrange string word into ascending order.

public class Prog77 {

	public static void main(String[] args) {
		        String s = "sushma";
				char[] ch = s.toCharArray();
				char temp =0;
				for(int i=0;i<ch.length;i++)
				{
				for(int j=0;j<ch.length;j++)
				{
				if(ch[i]<ch[j]) // for descending order (>)
				{
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				}
		}        
				}
				for(int i=0;i<ch.length;i++)
				{
					System.out.println(ch[i]);
				}
	}
}
