/* 1 2 3 4 5 6 7 8 9 10
*****
10 9 8 7 6 5 4 3 2 1*/

class Loop
{
  public static void main(String[] args)
  {
	for(int i=1;i<=10;i++)
	{
	   System.out.print(i+" ");
	}
   System.out.println("*****");

	for(int j=10;j>=1;j--)
	{
	   System.out.print(j+" ");
	}
  }
}
