// WAP to check whether two array is same or different.

public class Prog76 
{
	public static void main(String[] args) 
	{
		int[] ar1 = {1,2,3,4,5};
		int[] ar2 = {1,2,3,4,5,6};
		int count=0;
		if(ar1.length==ar2.length)
		{
			for(int i=0;i<ar1.length;i++)
			{
				if(ar1[i]==ar2[i])
					{
						count++;
					}
			}
				if(count==ar1.length)
				{
					System.out.println("Same Array");
				}
					else
					{
						System.out.println("Different array");
					}
				
			}
		
	}

}
