// WAP to search element in linear search.

public class Prog71 
{
	static int linearsearch(int[] arr,int search)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==search)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = {2,4,1,5,9,10};
		int search = 5;
		int index = linearsearch(arr,search);
		if(index==-1)
		{
			System.out.println("Element is not present in given array");
		}
		else
		{
			System.out.println("Element present in given position "+index);
		}
	}

}
