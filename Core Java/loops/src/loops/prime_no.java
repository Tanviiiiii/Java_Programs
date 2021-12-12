package loops;

public class prime_no {

	public static void main(String[] args) {
		int num = 13;
		if (num % 2 == 0) {
			System.out.println("Number is not prime...");
			return;
		}
		int sr = (int) Math.sqrt(num);
		for (int c = 3; c < -sr; c += 2) {
			if (num % c == 0) {
				System.out.println("Number is divided by" + c + "so it is not prime");
				return;
			}

		}
		System.out.println("Number is prime...");

	}

}
