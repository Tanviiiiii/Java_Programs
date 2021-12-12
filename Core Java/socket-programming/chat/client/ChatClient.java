import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ChatClient
{
  private Socket soc;
  public ChatClient()
  {
    try
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your name:");
	String name=sc.nextLine();
	soc=new Socket("localhost",2001);
	DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
	new ReadMessageThread().start();
	while(true)
	{
	  String msg=sc.nextLine();
	  dos.writeUTF(name+" said:"+msg);
	}
    }
    catch(Exception ex)
    {
	System.out.println(ex);
    } 	
  }
  class ReadMessageThread extends Thread
  {
    public void run()
    {
      try
      {
	DataInputStream dis=new DataInputStream(soc.getInputStream());
	while(true)
	{
	  String msg=dis.readUTF();
	  System.out.println(msg);
	}
      }
      catch(Exception ex)
      {
	System.out.println(ex);
      }   	
    }
  }
  public static void main(String []args)
  {
	new ChatClient();
  }
}