package DataInputStream;

import java.io.*;
class AA
{
public static void main(String []args)
{
    try
      {
         FileInputStream fis=new FileInputStream("AA.txt");//write mode
         DataInputStream dis=new DataInputStream(fis);
        String str=dis.readLine();

	while(str!=null)
	{
	System.out.print(str);
	str=dis.readLine();
                  }
     }

    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }

} 
}