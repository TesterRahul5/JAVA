class Alpha2 // Method Overloading in Inheritance Case
{
	int i=10; // Parent Variable
void show()	// Parent Method
{
	System.out.println("I am in Alpha1 class"); // Parent Implementation
}
}
class Beta2 extends Alpha2
{
	int i=70;  // Child Variable
	void show()	 // Parent Method
	{
		super.show();
		System.out.println(super.i);
		System.out.println("I am in Beta1 class"); // Child Implementation
	}
}
public class Sample42 {

	public static void main(String[] args) {
		Beta2 b  = new Beta2();
		System.out.println(b.i); // 70
		b.show(); // Alpha class method
		
	}
}

