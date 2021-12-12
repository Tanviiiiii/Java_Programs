package FileOutputStreamClass;

import java.io.*;
class Linebyline
{
public static void main(String []args)
{
    try
      {
         FileOutputStream fos=new FileOutputStream("AA.txt");//write mode
PrintStream ps=new PrintStream(fos);

ps.println("It insert new line character");
ps.print("It does not insert new line character");
ps.println("Shubhi Java Course");
      }
    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }
} 
}