package constructors;

public class overloading {
	int id;
	String name;
	int age;

	// creating two arg constructor
	overloading(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	overloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		overloading s1 = new overloading(111, "Tanvi");
		overloading s2 = new overloading(222, "Ashmit", 21);
		s1.display();
		s2.display();
	}
}
