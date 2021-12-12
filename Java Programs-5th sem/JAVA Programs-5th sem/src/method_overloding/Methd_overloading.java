package method_overloding;
import java.util.Scanner;
class test {
	int length, breadth;
	float radius;

	int area(int length) {
		System.out.print("Area of square:");
		return length * length;
	}	
	int area(int length, int breadth) {
		System.out.print("Area of reactangle:");
		return length * breadth;
	}
	double area(float radius) {
		System.out.print("Area of circle:");
		return (3.14 * radius * radius);
	}
}
	public class Methd_overloading{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for length:");
		int length = sc.nextInt();

		System.out.println("Enter value for breadth:");
		int breadth = sc.nextInt();

		System.out.println("Enter value for radius:");
		float radius = sc.nextInt();
		
		test obj=new test ();
		System.out.println(obj.area(length));
		System.out.println(obj.area(length, breadth));
		System.out.println(obj.area(radius));
	}
}
	