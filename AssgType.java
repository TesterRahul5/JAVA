/* Hi 1 2 3 4 5 6 7 8 9 10 (1st loop)
Hi 1 Hi 2 Hi 3 Hi 4 Hi 5 Hi 6 Hi 7 Hi 8 Hi 9 Hi 10 Hi (2nd loop)
Hello Hi Hello Hi Hello Hi Hello Hi Hello Hi Hello Hi Hello Hi Hello Hi Hello Hi Hello Hi (3rd Loop) */

public class AssgType 
{
  public static void main(String[] args) 
  {
	int i=1;
	int j=1;
	for(System.out.print("Hi ");i<=10;i++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	for(System.out.print("Hi ");j<=10;System.out.print("Hi "))
	{
		System.out.print(j+" ");
		j++;
	}
	System.out.println();
    for(int k=1;k<=10;k++)
    {
    	System.out.print("Hello ");
    	System.out.print("Hi ");
    }
  }
}
