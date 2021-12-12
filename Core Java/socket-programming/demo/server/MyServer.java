import java.net.*;
import java.io.*;
public class MyServer
{
  private ServerSocket server;
  public MyServer()
  {
    try
    {
	server=new ServerSocket(2001);//2001 will be port number of server program
	System.out.println("Server started...");
	while(true)
	{
          System.out.println("Ready to accept client request..."); 
	  Socket soc=server.accept();
	  System.out.println("Client request accepted...");		 
	}
    }
    catch(Exception ex)
    {
	System.out.println(ex);
    } 	
  }
  public static void main(String []args)
  {
	new MyServer();
  }
}