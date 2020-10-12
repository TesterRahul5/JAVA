class Alpha // Multilevel Inheritance Example
{
	Alpha()
	{
		System.out.println("I am in Alpha");
	}
}
class Beta extends Alpha
{
	Beta()
	{
		System.out.println("I am in Beta");
	}
}
class Gamma extends Beta
{
	Gamma()
	{
		System.out.println("I am in Gamma");
	}
}
public class Sample32 {

	public static void main(String[] args) {
		Gamma g = new Gamma();
	}

}
