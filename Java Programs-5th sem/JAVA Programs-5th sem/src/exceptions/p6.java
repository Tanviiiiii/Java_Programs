package exceptions;

public class p6 {
	public static void main(String args[]) {
		try {
			int num = Integer.parseInt("TANVI");
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
