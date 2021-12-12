package FileWriterStream;
import java.io.*;
class Charbycharwriteappend2
{
public static void main(String []args)
{
    try
      {
         FileWriter fw=new FileWriter("AA.txt",true);//append mode
         fw.write('s');
         fw.write('h');
fw.write('a');
fw.write('r');
fw.write('m');

fw.flush();
      }
    catch(Exception ex)
    {
    System.out.println("Something went wrong..."+ex);
    }
} 
}