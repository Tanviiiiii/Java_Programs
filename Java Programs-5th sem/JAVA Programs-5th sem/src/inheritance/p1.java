package inheritance;

class Person {
	static int a;
	static int b;

	Person(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Student extends Person {
	static int c;
	static int d;

	Student(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;

	}
	static void show(int a, int b, int c, int d) {
		System.out.println("value of a:" + a);
		System.out.println("value of b:" + b);
		System.out.println("value of c:" + c);
		System.out.println("value of d:" + d);
	}
}
public class p1 {
	public static void main(String[] args) {
		Student.show(10,20,30,40);
	}
}