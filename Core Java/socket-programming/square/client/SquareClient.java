import java.net.*;
import java.io.*;
import java.util.Scanner;
public class SquareClient
{
  private Socket soc;
  public SquareClient()
  {
    try
    {
	soc=new Socket("localhost",2001);
	DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
	DataInputStream dis=new DataInputStream(soc.getInputStream());
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	  System.out.print("Enter your number:");
	  String num=sc.nextLine();
	  dos.writeUTF(num);
	  String sq=dis.readUTF();
	  System.out.println(sq); 
	}
    }
    catch(Exception ex)
    {
	System.out.println(ex);
    } 	
  }
  public static void main(String []args)
  {
	new SquareClient();
  }
}