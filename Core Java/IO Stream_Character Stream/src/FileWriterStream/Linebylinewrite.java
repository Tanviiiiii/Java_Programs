package FileWriterStream;
import java.io.*;
class Linebylinewrite
{
public static void main(String []args)
{
    try
      {
         FileWriter fw=new FileWriter("AA.txt");//writeMode
PrintWriter pw=new PrintWriter(fw);

pw.println("Shubhi Sharma");
pw.print("IMSEC");
pw.println(" CSE-4");
pw.flush();
      
      }
    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }
} 
}