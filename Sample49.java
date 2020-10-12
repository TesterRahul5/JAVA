class Alpha22 // instanceof operator example 
{
	
}
class Beta22 extends Alpha22
{
	
}
public class Sample49 
{
	public static void main(String[] args) 
	{
		Alpha22 a= new Alpha22();
		Beta22 b = new Beta22();
	   Alpha22 a1 = new Beta22();
		System.out.println(a instanceof Alpha22);
		System.out.println(a instanceof Beta22);
		System.out.println(b instanceof Alpha22);
		System.out.println(b instanceof Beta22);
		System.out.println(a1 instanceof Alpha22);
		System.out.println(a1 instanceof Beta22);	
	}
}