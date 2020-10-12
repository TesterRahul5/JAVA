class Circle // Method Overloading by call different class
{
	
}
class Rectangle
{
	
}
class Shape
{
		
}
public class Graphic 
{	
	void draw(Circle c)
	{
		System.out.println("Draw a Circle");
	}
	void draw(Rectangle r)
	{
		System.out.println("Draw a Rectangle");
	}
	void draw(Shape s)
	{
		System.out.println("Draw a general Shape");
	}
	void draw(Circle c,Rectangle r)
	{
		System.out.println("Draw Circle and Rectangle");
	}
	public static void main(String[] args)
	{	
		Graphic g = new Graphic();
		g.draw(new Circle());
		g.draw(new Rectangle());
		g.draw(new Shape());
		g.draw(new Circle(), new Rectangle());
	}
}
