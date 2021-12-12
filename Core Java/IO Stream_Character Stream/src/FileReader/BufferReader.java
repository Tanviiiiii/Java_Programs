package FileReader;

import java.io.*;

class AA {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("AA2.txt");// write mode
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();

			while (str != null) {
				System.out.print(str);
				str = br.readLine();
			}
		}

		catch (Exception ex) {
			System.out.println("Something went wrong..." + ex);
		}

	}
}