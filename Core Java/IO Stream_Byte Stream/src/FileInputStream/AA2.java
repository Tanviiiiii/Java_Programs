package FileInputStream;

import java.io.*;
class AA2
{
public static void main(String []args)
{
    try
      {
         FileInputStream fis=new FileInputStream("AA.txt");//write mode
         int x=fis.read();

	while(x!=-1)
	{
	System.out.print(x+"--->");
	System.out.println((char)x);
	x=fis.read();
                  }
     }

    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }

} 
}