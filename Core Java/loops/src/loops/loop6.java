package loops;

public class loop6 {

	public static void main(String[] args) {
		int num = 872500987;
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Total Digits: " + count);

	}

}
