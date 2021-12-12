package loops;

public class loop2 {

	public static void main(String[] args) {
		int x = 10, y = 20, z = 30;
		if (x > y && x > z) {
			System.out.println(x);
		} else if (y > x && y > z) {
			System.out.println(y);
		} else {
			System.out.println(z);
		}
	}
}
