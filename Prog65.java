// WAP to enter the value of array from user and reverse the array.

import java.util.Scanner;

public class Prog65 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int ar[] = new int[size];
		System.out.println("Enter the array Elements");
		for(int i=0;i<size;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Before Reversing array element");
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("After Reversing array element");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}