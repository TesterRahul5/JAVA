// WAP for binary search.

public class Prog74 
{
	static int binarysearch(int[] arr, int search)
	{
		int first=0;
		int last = arr.length;
		while(first<last)
		{
			int mid = (first+last)/2;
			if(search<arr[mid])
			{
				last = mid;
				
			}
			else if(search>arr[mid])
			{
				first=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,6,8,10,20,21};
		int search = 3;
		int index = binarysearch(arr,search);
		if(index== -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("The Search element is at index "+index);
		}

	}

}
