class Employ // Assign value in Constructor and display
{
	String name;
	int id;
	double sal;
	Employ(String n,int d,double s)
	{
		name=n;
		id=d;
		sal=s;
	}
	void display()
	{
		System.out.println("Employee name "+name+"\nEmployee id "+id+"\nEmployee salary "+sal);
	}
}
public class Sample26 {

	public static void main(String[] args) {
		 
		Employ e1= new Employ("John",21,4094.0);
		e1.display();
		Employ e2= new Employ("Rajat",20,4000.0);
		e2.display();
		Employ e3= new Employ("Aman",25,5000.0);
         e3.display();
	}
}