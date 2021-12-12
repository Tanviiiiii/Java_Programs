import java.net.*;
import java.io.*;
public class MyClient
{
  private Socket soc;
  public MyClient()
  {
    try
    {
	soc=new Socket("localhost",2001);
    }
    catch(Exception ex)
    {
	System.out.println(ex);
    } 	
  }
  public static void main(String []args)
  {
	new MyClient();
  }
}