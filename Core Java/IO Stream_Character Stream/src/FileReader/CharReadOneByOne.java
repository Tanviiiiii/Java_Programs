package FileReader;

import java.io.*;
class CharReadOneByOne
{
public static void main(String []args)
{
    try
      {
         FileReader fr=new FileReader("AA.txt");//write mode
         int x=fr.read();

	while(x!=-1)
	{
	System.out.print(x+"--->");
	System.out.println((char)x);
	x=fr.read();
                  }
     }

    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }

} 
}