package mypack;

class interestDemoo implements employee {
	int x;

	@Override
	public void input(int x) {
		this.x = x;
		System.out.println(x);
		System.out.println("input method overload");

	}

	@Override
	public void calculateinterest() {
		System.out.println("interest method overloaded");

	}
}

public class main {
	public static void main(String[] args) {
		interestDemoo interestDemo = new interestDemoo();
		interestDemo.input(100);
		interestDemo.calculateinterest();
	}
}