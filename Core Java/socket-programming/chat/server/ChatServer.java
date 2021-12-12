import java.net.*;
import java.io.*;
import java.util.ArrayList;
public class ChatServer
{
  private ServerSocket server;
  private ArrayList<Socket> soclist=new ArrayList<Socket>();
  public ChatServer()
  {
    try
    {
	server=new ServerSocket(2001);
	System.out.println("Public chat server started...");
	while(true)
	{
          Socket soc=server.accept();
	  soclist.add(soc);
	  System.out.println("Client request accepted...");	
	  new ChatThread(soc,soclist).start();	 
	}
    }
    catch(Exception ex)
    {
	System.out.println(ex);
    } 	
  }
  public static void main(String []args)
  {
	new ChatServer();
  }
}
class ChatThread extends Thread
{  
  private Socket soc;
  private ArrayList<Socket> soclist;
  public ChatThread(Socket soc,ArrayList<Socket> soclist)
  {
	this.soc=soc;
	this.soclist=soclist;
	System.out.println("A thread is created and started by the server for the client"); 
  }
  public void run()
  {
    try
    {
	DataInputStream dis=new DataInputStream(soc.getInputStream());
	while(true)
	{
	  String message=dis.readUTF();
	  for(int i=0;i<soclist.size();i++)
	  {
		Socket sc=soclist.get(i);
		DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
	 	dos.writeUTF(message);
	  }
	}
    }
    catch(Exception ex)
    {
	System.out.println(ex);
    }      	
  }
}
