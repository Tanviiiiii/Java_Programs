package exceptions;
public class arithemetic 
{
	public static void main(String args[]) 
	{
		try 
		{
			int a= 100/0;
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
	}
}