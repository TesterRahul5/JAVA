// WAP for Contiguous array.

public class Prog75
{
	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,4,5,6};
		for(int i=1;i<ar.length;i=i+2)
		{
			int temp = ar[i];
			ar[i] = ar[i-1];
			ar[i-1] = temp;
		}
		System.out.println("Display the Element");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
