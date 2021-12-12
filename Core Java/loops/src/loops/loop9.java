package loops;

public class loop9 {

	public static void main(String[] args) {
		int avg = 80;
		if (avg >= 60) {
			System.out.println("First division");
		} else {
			if (avg >= 45) {
				System.out.println("Second division");
			} else {
				if (avg >= 33) {
					System.out.println("Third division");
				} else {
					System.out.println("Fail");
				}
			}
		}
	}
}