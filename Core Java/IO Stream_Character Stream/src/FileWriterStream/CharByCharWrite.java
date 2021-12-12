package FileWriterStream;

import java.io.*;

class CharByCharWrite {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("AA.txt");// write mode
			fw.write('T');
			fw.write('A');
			fw.write('N');
			fw.write('V');
			fw.write('I');
			fw.flush();
		} catch (Exception ex) {
			System.out.println("Something went wrong..." + ex);
		}
	}
}