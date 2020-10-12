class Cubo // Constructor Overloading 
{
	Cubo(int i)
	{
		System.out.println(i);
	}
	Cubo(String s)
	{
		System.out.println(s);
	}
	Cubo(int i,String s)
	{
		System.out.println(i+" "+s);
	}
	Cubo(String s,int i)
	{
		System.out.println(s+" "+i);
	}
}
public class Sample34 {

	public static void main(String[] args) {
		
         Cubo c1 = new Cubo(10);
         Cubo c2= new Cubo("Constructor");
         Cubo C3 = new Cubo(20,"Object");
         Cubo c4 = new Cubo("Overloading",35);
	}

}
