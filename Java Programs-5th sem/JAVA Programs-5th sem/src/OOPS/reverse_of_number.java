package OOPS;

import java.util.*;

class reverse {
	int num, rev = 0, sum = 0;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter any number:");
		num = sc.nextInt();
	}

	void func() {
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			sum = sum + rem;
			num = num / 10;
		}
	}

	void disp() {
		System.out.println("Reverse of num is: " + rev);
	}
}

public class reverse_of_number {
	public static void main(String[] args) {
		reverse obj = new reverse();
		obj.input();
		obj.func();
		obj.disp();
	}
}
