package operators;
import java.util.Scanner;
public class operators 
{
	int a, b, c;
	void arithmetic(int a, int b) {
		System.out.println("Arithmetic Operators:");
		System.out.println("----------------------");
		System.out.println("Addition:" + (a + b));
		System.out.println("substraction:" + (a - b));
		System.out.println("multiplication:" + (a * b));
		System.out.println("division:" + (a / b));
		System.out.println("modulus:" + (a % b));
		System.out.println("");
	}
	void logical(int a, int b, int c) {
		System.out.println("Logical Operators:");
		System.out.println("----------------------");
		if (a > b && a > c)
			System.out.println("a is the greater number: " + a);
		else if (a > b || a > c)
			System.out.println("a is greater than b: " + b);
		else if (a != b)
			System.out.println("a is not equal to b");
		System.out.println("");
	}
	void relational(int a, int b) {
		System.out.println("Relational Operators:");
		System.out.println("----------------------");
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println("");
	}
	void bitwise(int a, int b) {
		System.out.println("Bitwise Operator:");
		System.out.println("----------------------");
		System.out.println("OR operator:  " + (a | b));
		System.out.println("AND operator: " + (a & b));
		System.out.println("XOR operator: " + (a ^ b));
		System.out.println("");
	}
	void unary(int a, int b) {
		boolean c = true;
		boolean d = false;
		System.out.println("Unary Operator:");
		System.out.println("----------------------");
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(!c);
		System.out.println(!d);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a:");
		int a = sc.nextInt();

		System.out.println("Enter value for b:");
		int b = sc.nextInt();

		System.out.println("Enter value for c:");
		int c = sc.nextInt();

		operators obj = new operators();
		obj.arithmetic(a, b);
		obj.logical(a, b, c);
		obj.relational(a, b);
		obj.bitwise(a, b);
		obj.unary(a, b);
	}
}
