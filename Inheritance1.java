class Employee2  // Hierarchy Inheritance
{
	String name;
	double sal;
	int empid;
	String designation;
	  void swipecard()
	  {
	    System.out.println("employee name "+name+"\nsalary is "+sal+"\nid is "+empid+"\ndesignation is "+designation);
		System.out.println("swiped card");
	  }
	void fulldetails()
	{
	    System.out.println("***********");
	    System.out.println("employee name "+name+"\nsalary is "+sal+"\nid is "+empid+"\ndesignation is "+designation);
		System.out.println("***********");
	}
}
class Developer1 extends Employee2
{
	Developer1(String n,int id,double s,String d)
	{
		name=n;
		empid=id;
		sal=s;
		designation =d;
	}
	void devlopcode()
	{
	    System.out.println("developing code");
	} 
}
class Tester extends Employee2
{
	Tester(String n,int id,double s,String d)
	{
		name=n;
		empid=id;
		sal=s;
		designation=d;
	}
	void  testapp()
	{
	    System.out.println("testing application");
	}
}   
public class Inheritance1
 {  
    public static void main(String args[])
    {
	    Developer1 d=new Developer1("Krishna",1,5000.00,"developer");
		d.swipecard();
		d.devlopcode();
		d.fulldetails();
		Tester t=new Tester("Prateek",2,4000.00,"tester");
		d.swipecard();
		t.testapp();
		t.fulldetails();
    }	
}