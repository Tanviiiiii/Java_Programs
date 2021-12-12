package exceptions;
import java.io.*;

public class p3 
{
	public static void main(String args[]) 
	{
		File f = new File("D://file.txt");
		try {
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
