package loops;

public class loop8 {

	public static void main(String[] args) {
		int x = 15, y = 10;
		int s = x < y ? x : y;
		while (x % s == 0 && y % s == 0) {
			s--;
		}
		System.out.println(s);
	}
}
