// WAP to find out the duplicate number present in two array.

public class Prog64 {

	public static void main(String[] args) 
	{
		int ar1[] = {2,1,6,3,7};
		int ar2[] = {10,20,3,40,2};
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
			{
				if(ar1[i]==ar2[j])
				{
					System.out.println(ar1[i]);
				}
			}
		}

	}

}
