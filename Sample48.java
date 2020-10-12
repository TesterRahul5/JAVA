class Alpha11      // Method Hiding Example,DownCasting Example
{
	static void show() // parent method
	{
		System.out.println("Hello");
	}
	void m1()
	{
		System.out.println("C++");
	}
}
class Beta11 extends Alpha11
{
	static void show() // child method
	{
		System.out.println("Hi");
	}
	void m1()
	{
		System.out.println("Java");
	}
}
public class Sample48 
{
	public static void main(String[] args) 
	{
		Alpha11 a = new Beta11(); 
		a.show();
		// Beta11 b = (Beta11)new Alpha11(); // Runtime error :ClasscastException
         Beta11 b = (Beta11)a; // downcasting
         b.m1();
	}
}
