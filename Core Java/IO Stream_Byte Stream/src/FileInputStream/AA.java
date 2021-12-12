package FileInputStream;

import java.io.*;
class AA
{
public static void main(String []args)
{
    try
      {
         FileInputStream fis=new FileInputStream("AA.txt");//write mode
         int x=fis.read();
System.out.print(x+"--->");
System.out.println((char)x);
      }
    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }
} 
}