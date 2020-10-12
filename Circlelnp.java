import java.util.Scanner; // Input Taken from user

	public class Circlelnp 
	{
		double pi = 3.14;
		void area(double radius)
		{
			double area=pi*radius*radius;
			System.out.println("Area of Circle "+area);
		}
		void circum(double radius)
		{
			double circm=2*pi*radius;
			System.out.println("Circumference of Circle "+circm);
		}
		public static void main(String[] args) 
		{
			Circlelnp c = new Circlelnp(); 
			Scanner s = new Scanner(System.in);
			System.out.println("Enter radius value");
			double r = s.nextDouble();
			c.area(r);
			System.out.println("Enter radius value");
			double r1 = s.nextDouble();
			c.circum(r1);
		}
	}

