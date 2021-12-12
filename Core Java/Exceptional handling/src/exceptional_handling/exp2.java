package exceptional_handling;
import java.io.*;
class exp2
{
public static void main (String [] args)
{
System.out.println("Execution begins");
try
{
FileInputStream fis=new FileInputStream ("aa.txt");
}
catch(FileNotFoundException ex)
{
System.out.println(ex);
}
System.out.println("Execution ends");
}
}


