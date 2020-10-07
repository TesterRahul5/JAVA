// WAP to make middle character as Uppercase.

import java.util.Scanner;

public class Prog53
{		
			public static void main(String[] args) 
			{
				 Scanner ss = new Scanner(System.in);
					System.out.println("Enter the String");
					String s = ss.nextLine();

				    String[] split = s.split( " " );
				    String[] toReturn = new String[split.length];
				    for (int i = 0; i < split.length;i++)
				    {
				        String word = split[i];
				        char[] chars = word.toCharArray();
				        chars[chars.length/2] = Character.toUpperCase( chars[chars.length/2] );
				        toReturn[i] = String.valueOf( chars );
				        System.out.println(toReturn[i]);
				    }

				}
			}
