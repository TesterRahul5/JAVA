// WAP to find sum of element in array.

public class Prog63 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,5,7,9};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
         System.out.println("Sum of elements "+sum);
	}

}
