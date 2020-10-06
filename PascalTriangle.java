import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PascalTriangle 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n = sc.nextInt();
		PascalTriangle p = new PascalTriangle();
		System.out.println("Generated Pascal Triangle");
		System.out.println(p.generate(n));
	}
	
	// Pascal Triangle method to print //
	
 public List<List<Integer>> generate(int numrows)
 {
	 List<List<Integer>> triangle = new ArrayList<>();
	     if(numrows == 0) return triangle;
	     
	 List<Integer> first_row = new ArrayList<>();
	 first_row.add(1);
	 triangle.add(first_row);
	 
	 for(int i=1;i<numrows;i++)
	 {
		 List<Integer> prev_row = triangle.get(i-1);
		 List<Integer> row = new ArrayList<>();
		 row.add(1);
		 
		 for(int j=1;j<i;j++)
		 {
			 row.add(prev_row.get(j-1)+prev_row.get(j));
			
	      }
	    row.add(1);
	    triangle.add(row);
	 }
	    return triangle;
  }
}
