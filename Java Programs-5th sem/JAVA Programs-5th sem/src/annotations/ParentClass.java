package annotations;

class ParentClass {
	public void display() {
		System.out.println("Parent class display() method");
	}

	public static void main(String args[]) {
		ParentClass obj = new ChildClass();
		obj.display();
	}
}

class ChildClass extends ParentClass {
	@Override
	public void display() {
		System.out.println("Child class display() method");
	}
}

