package exceptions;

public class p2 
{
	public static void main(String args[]) 
	{
		int num[] = { 1, 2, 3, 4 };
		try 
		{
			System.out.println(num[5]);
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}