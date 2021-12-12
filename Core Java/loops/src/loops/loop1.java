package loops;

public class loop1 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		for (int c = 0; c <= 10; c++) {
			boolean z = ++x < 5 && ++y < 10;
		}
		System.out.println(x);
		System.out.println(y);

	}

}
