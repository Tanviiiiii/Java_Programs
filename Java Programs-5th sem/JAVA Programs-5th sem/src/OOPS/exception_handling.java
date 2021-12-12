package OOPS;
import java.io.*;
public class exception_handling 
{
		public static void main(String[] args)
		{
			try {
				System.out.println("inside try block");
				System.out.println(34 / 2);
			}
			catch (ArithmeticException e) 
			{

				System.out.println("catch : exception handled.");
			}
			finally 
			{				
			System.out.println("finally : i execute always.");
			}
		}
	}

