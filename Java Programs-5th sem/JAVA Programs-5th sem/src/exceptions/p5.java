package exceptions;

public class p5 
{
	public static void main(String args[]) 
	{
		try 
		{
			String a = "My name is Tanvi";
			char c = a.charAt(24);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
	}
}
