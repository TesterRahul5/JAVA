class Alpha1 // Method Overloading in Inheritance Case
{
   void show(int i)	// Parent Method
  {
	System.out.println("I am in Alpha1 class");
  }
}
class Beta1 extends Alpha1
{	
	void show(String s)	 
	{
		System.out.println("I am in Beta1 class");
	}
}
public class Sample39 {

	public static void main(String[] args) {
		Beta1 b  = new Beta1();
		b.show(10); // Alpha class method
		b.show("abc"); // Beta class method
	}
}
