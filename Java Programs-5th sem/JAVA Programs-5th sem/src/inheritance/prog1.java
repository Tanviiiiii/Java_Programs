package inheritance;

class Personn {
	int a, b;

	Personn(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Studentt extends Person {
	int c, d;

	Studentt(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;

	}

	void show() {
		System.out.println("value of a:" + a);
		System.out.println("value of b:" + b);
		System.out.println("value of c:" + c);
		System.out.println("value of d:" + d);
	}
}

public class prog1 {
	public static void main(String[] args) {
		Studentt s = new Studentt(10, 20, 30, 40);
		s.show();
	}
}
