package inheritance;

interface one {
	default void show()
	{
		System.out.println("multiple inheritance implemented using interface 1");
	}
}
interface two {
	default void show()
	{
		System.out.println("multiple inheritance implemented using interface 2");
	}
}
class TestClass implements one, two {
	public void show()
	{
		one.super.show();
		two.super.show();
	}
	public static void main(String args[])
	{
		TestClass d = new TestClass();
		d.show();
	}
}
