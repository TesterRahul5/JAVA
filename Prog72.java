// Input >> 1,2,3,4,5,6 == output >> 4,5,6,1,2,3

public class Prog72
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6};
		int n = arr.length;
		System.out.println("Before Swapping the element");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-n/2+i];
			arr[n-n/2+i] = temp;
		}
		System.out.println();
		System.out.println("After Swapping the element");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
