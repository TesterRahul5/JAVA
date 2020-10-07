/* Swap the Numbers using Xor or two variable concept.
 * 
 */

import java.util.Scanner;

public class Swap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before Swap the value "+ x +" "+ y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		// x = x+y;
		// y = x-y;
		// x = x-y;
		
		System.out.println("After Swap the value "+ x +" "+ y);

	}

}
