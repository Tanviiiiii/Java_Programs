package annotations;

class Base {
	public void display() {
		System.out.println("Base class display() method");
	}
}

public class Derived extends Base {
	@Override
	public void display() {
		System.out.println("Derived class display(int) method");
	}

	public static void main(String args[]) {
		Derived obj = new Derived();
		obj.display();
	}
}