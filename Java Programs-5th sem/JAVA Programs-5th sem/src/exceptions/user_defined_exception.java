package exceptions;

public class user_defined_exception extends Exception {
	private static int rollno[] = { 1, 2, 3, 4, 5 };

	private static String name[] = { "arzoo", "tanvi", "ashmit", "anirudh"};

	private static double marks[] = { 90, 75, 70, 40, 80 };

	user_defined_exception() {
	}

	user_defined_exception(String str) {
		super(str);
	}

	public static void main(String[] args) {
		try {
			System.out.println("RollNo." + "\t" + "Names" + "\t" + "Marks");

			for (int i = 0; i < 5; i++) {
				System.out.println(rollno[i] + "\t" + name[i] + "\t" + marks[i]);

				if (marks[i] < 50) {
					user_defined_exception me = new user_defined_exception("marks is less than 50");
					throw me;
				}
			}
		} catch (user_defined_exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("final block execute always");
		}
		
	}
}
