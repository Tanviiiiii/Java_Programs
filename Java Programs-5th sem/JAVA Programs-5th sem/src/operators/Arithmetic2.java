package operators;

import java.util.Scanner;

class Arithmetic {
	int a, b;
	Scanner sc = new Scanner(System.in);

	void arith() {
		System.out.println("Enter value of a:");
		a = sc.nextInt();

		System.out.println("Enter value of b:");
		b = sc.nextInt();

		System.out.println("Addition:" + (a + b));
		System.out.println("substraction:" + (a - b));
		System.out.println("multiplication:" + (a * b));
		System.out.println("division:" + (a / b));
		System.out.println("modulus:" + (a % b));
	}
}

public class Arithmetic2 {
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		ar.arith();
	}
}
