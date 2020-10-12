
class Employee1
{
double bonus =3000.0;

void working()
	{
	    System.out.println("working");
	}
  
}
class Developer extends Employee1
{
double sal=50000.00;
void devlopcode()
	{
	    System.out.println("developing code");
	}
}
  
  public class Inheritance
{  
    public static void main(String args[])
    {
	    Employee1 e= new Employee1();   
        System.out.println("parent class properties");
		System.out.println("employee  bonus is "+e.bonus);
		 Developer d= new Developer();   
        System.out.println("child class properties");
		System.out.println("developer bonus is "+d.bonus+"\ndeveloper salary is "+d.sal);
		e.working();
		d.devlopcode();
	
    }
	
}