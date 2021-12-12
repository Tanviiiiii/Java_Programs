package FileOutputStreamClass;

import java.io.*;
class AA
{
public static void main(String []args)
{
    try
      {
         FileOutputStream fis=new FileOutputStream("AA.txt");//write mode
      }
    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }
} 
}