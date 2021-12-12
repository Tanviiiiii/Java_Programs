import java.net.*;
import java.io.*;
public class SquareServer
{
  private ServerSocket server;
  public SquareServer()
  {
    try
    {
	server=new ServerSocket(2001);
	System.out.println("Server started...");
	while(true)
	{
          Socket soc=server.accept();
	  System.out.println("Client request accepted...");	
	  new SquareThread(soc).start();	 
	}
    }
    catch(Exception ex)
    {
	System.out.println(ex);
    } 	
  }
  public static void main(String []args)
  {
	new SquareServer();
  }
}
class SquareThread extends Thread
{  
  private Socket soc;
  public SquareThread(Socket soc)
  {
	this.soc=soc;
	System.out.println("A thread is created and started by the server for the client"); 
  }
  public void run()
  {
    try
    {
	DataInputStream dis=new DataInputStream(soc.getInputStream());
	DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
	while(true)
	{
	  String str=dis.readUTF();
	  int num=Integer.parseInt(str);
	  int sq=num*num;
	  dos.writeUTF("Square="+sq);
	}
    }
    catch(Exception ex)
    {
	System.out.println(ex);
    }      	
  }
}
