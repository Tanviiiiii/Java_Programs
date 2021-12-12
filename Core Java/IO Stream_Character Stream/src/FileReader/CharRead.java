package FileReader;

import java.io.*;
class CharRead
{
public static void main(String []args)
{
    try
      {
         FileReader fr=new FileReader("AA.txt");//write mode
         int x=fr.read();

	
	System.out.print(x+"--->");
	System.out.println((char)x);
	
     }

    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }

} 
}