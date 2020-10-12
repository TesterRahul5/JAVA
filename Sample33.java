public class Sample33  // Method Overloading or Compile Time Polymorphism.
{
	void search(String prodname)
	{
		System.out.println("Product Name is "+prodname);
	}
	void search(String prodname,double cost)
	{
		System.out.println("Product Name is "+prodname+" Cost is "+cost);
	}
	void search(double cost,String prodname)
	{
		System.out.println("Cost is "+cost+" Product Name is "+cost);
	}
   public static void main(String[] args)
	{
		Sample33 s = new Sample33();
		 s.search("Shoe");
		 s.search("Mobile", 8000.0);
		 s.search(8000.0, "Mobile");

	}

}
