package constructors;

public class parameterised {
	int id;
	String name;

	parameterised(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {

		parameterised s1 = new parameterised(111, "Tanvi");
		parameterised s2 = new parameterised(222, "Ashmit");

		s1.display();
		s2.display();
	}
}
