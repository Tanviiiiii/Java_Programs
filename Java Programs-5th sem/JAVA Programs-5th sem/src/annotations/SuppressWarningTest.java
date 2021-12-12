package annotations;

class DeprecatedTest {
	@Deprecated
	public void display() {
		System.out.println("display() method of Test class");
	}
}

public class SuppressWarningTest {
	@SuppressWarnings({ "checked", "deprecation" })
	public static void main(String args[]) {
		DeprecatedTest obj = new DeprecatedTest();
		obj.display();
	}
}
