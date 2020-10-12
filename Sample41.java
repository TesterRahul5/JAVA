public class Sample41
{
  public static void main(String[] args) 
	{
		 double d=50.0;
	// int i=d; // Compile time errora
		int i = (int)d;
		System.out.println(i); // 50
        int j = 80;
       // byte b =j; // Compile time error
        byte b = (byte)j;
        System.out.println(b); //80
	}
}