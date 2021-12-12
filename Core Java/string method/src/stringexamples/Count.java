package stringexamples;

/* Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text. 
Sample Output:

The given string is: mam is in the room
The number of words ends eith m or n is: 3 */

import java.io.*;
class Count
{
    public static void main(String []args)
    {
        String s="mam is in the room";
System.out.println("Original String: "+s);

       int count=0;

        for(int i=0;i<s.length();i++)
        {
         
	 if(s.charAt(i)=='m')
	{
                    count++;
                  }
        }
System.out.println("The nos of m is: " +count);
     }
}