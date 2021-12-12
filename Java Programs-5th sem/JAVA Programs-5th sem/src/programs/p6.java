package programs;

class p6 {
	static boolean isRectangle(int a, int b, int c, int d) {
		if (a == b && a == c && a == d && c == d && b == c && b == d)
			return true;

		else if (a == b && c == d)
			return true;
		else if (a == d && c == b)
			return true;
		else if (a == c && d == b)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		int a = 1, b = 2, c = 3, d = 4;
		if (isRectangle(a, b, c, d))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
