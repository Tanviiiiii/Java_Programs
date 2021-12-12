package FileOutputStreamClass;

import java.io.*;
class Charbychar
{
public static void main(String []args)
{
    try
      {
         FileOutputStream fos=new FileOutputStream("AA.txt");//write mode
         fos.write(65);
         fos.write(66);
fos.write(67);
fos.write(68);
fos.write(69);
fos.write('s');
fos.write('h');
      }
    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }
} 
}