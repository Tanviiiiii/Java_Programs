package FileWriterStream;
import java.io.*;
class Charbycharwritendappend
{
public static void main(String []args)
{
    try
      {
         FileWriter fw=new FileWriter("AA.txt",true);//append mode
         fw.write('S');
         fw.write('H');
fw.write('U');
fw.write('B');
fw.write('H');
fw.write('I');
fw.flush();
      }
    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }
} 
}