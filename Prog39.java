/*
     for n=15
A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U 
V W X Y Z [ \ 
] ^ _ ` a b c d 
e f g h i j k l m 
n o p q r s t u v w 
x y z { | } ~     
            
             
      ¡ ¢ £ ¤ ¥ ¦ § ¨ © 
ª « ¬ ­ ® ¯ ° ± ² ³ ´ µ ¶ · ¸ 

*/

import java.util.Scanner;

public class Prog39
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		  System.out.println("Enter the row");
		  int row=ss.nextInt();
         char count='A' ;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		   }
	}
}
