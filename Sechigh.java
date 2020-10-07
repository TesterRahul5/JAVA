// Return the second largest number in array.


import java.util.Scanner;

public class Sechigh 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scan.nextInt();
        int[] array = new int[length];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        int secondLargestNumber = secondLargest(array);
        System.out.println("Second largest number is " + secondLargestNumber);
    }
 
    public static int secondLargest(int[] array)
    {
        // Sort the array    
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1; j++) 
            {
                if (array[j] < array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Return second largest number
        return array[1];
    }
	}

