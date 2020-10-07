public class String1
 {
     String1(String str) {}
	public static void main(String[] args) 
	{	
  		String s = "Hello";
  		String s1 = "Hello";
      			System.out.println(s.equals(s1)); //content comparison
  		StringBuffer sb1 = new StringBuffer("People");
  		StringBuffer sb2 = new StringBuffer("People");
 			 System.out.println(sb1.equals(sb2)); // Reference comparison
 		String1 t = new String1("ratan");
  		String1 t1 = new String1("ratan");
  			System.out.println(t.equals(t1));   //Reference comparison
  
 		// String to StringBuffer
  		String st = "Rahul";
 		StringBuffer sb3 = new StringBuffer(st);
  			System.out.println(sb3.reverse());
   
		// String to StringBuffer
   		StringBuffer sb4 = new StringBuffer("ratan");
   		String st1 = sb4.toString();
   		System.out.println(st1);
  	}
 }
