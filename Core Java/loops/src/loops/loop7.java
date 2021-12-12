package loops;

public class loop7 {

	public static void main(String[] args) {
		int x = 15, y = 10;
		int s = x < y ? x : y;
		while (true) {
			if (x % s == 0 && y % s == 0) {
				break;
			}
			s--;
		}
		System.out.println(s);

	}

}
