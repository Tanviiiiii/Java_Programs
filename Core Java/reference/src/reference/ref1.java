package reference;

class ref1 {
	private int x;

	public void ref(int n) {
		x = n;
	}

	public void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		ref1 a1, a2, a3;
		a1 = new ref1();
		a2 = new ref1();
		a3 = new ref1();
		a1 = a2;
		a1.show();
		a2 = a3;
		a2.show();
		a3 = a1;
		a3.show();
	}
}
