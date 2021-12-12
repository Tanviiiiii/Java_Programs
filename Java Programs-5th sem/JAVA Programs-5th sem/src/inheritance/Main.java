package inheritance;
import java.util.Scanner;
abstract class Office {
	int empNo;
	String empName;
	int salary;

	abstract void getData();
}
class Teaching extends Office {
	String designation;

	void setData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee number: ");
		empNo = sc.nextInt();

		System.out.print("Enter Employee name: ");
		empName = sc.next();

		System.out.print("Enter salary: ");
		salary = sc.nextInt();

		System.out.print("Enter designation: ");
		designation = sc.next();
	}
	void getData() {
		System.out.println("Employee name: " + empName);
		System.out.println("Employee number: " + empNo);
		System.out.println("Salary: " + salary);
		System.out.println("Designation: " + designation);
	}
}
class Non_teaching extends Office {
	String designation;

	void setData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee number: ");
		empNo = sc.nextInt();

		System.out.print("Enter Employee name: ");
		empName = sc.next();

		System.out.print("Enter salary: ");
		salary = sc.nextInt();

		System.out.print("Enter designation: ");
		designation = sc.next();
	}

	void getData() {
		System.out.println("Employee name: " + empName);
		System.out.println("Employee number:" + empNo);
		System.out.println("Salary: " + salary);
		System.out.println("Designation: " + designation);
	}
}
public class Main {
	public static void main(String[] args) {
		Teaching t1 = new Teaching();
		Non_teaching nt1 = new Non_teaching();

		System.out.println("Data about Teaching class:");
		System.out.println("---------------------------------");
		t1.setData();
		t1.getData();

		System.out.println("Data about Non teaching class:");
		System.out.println("---------------------------------");
		nt1.setData();
		nt1.getData();

	}
}
