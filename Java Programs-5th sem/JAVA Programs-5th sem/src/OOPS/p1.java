package OOPS;
import java.util.*;

class emp {
	String name;
	int enroll;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter your name:");
		name = sc.nextLine();
		
		System.out.println("Enter your enroll no:");
		enroll = sc.nextInt();
	}

	void disp() {
		System.out.println("Your Name is:" + name);
		System.out.println("Your Enrollment no is:" + enroll);
	}
}

public class p1 {
	public static void main(String[] args) {
		emp obj = new emp();
		obj.input();
		obj.disp();
	}

}
